package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://matnow138.github.io";
    private WebDriver driver;
    private Random generator;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }


    public String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,'https://mateusz-crud.herokuapp.com/v1/tasks/')]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,'https://mateusz-crud.herokuapp.com/v1/tasks/')]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,'https://mateusz-crud.herokuapp.com/v1/tasks/')]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);            // [1]
        String taskContent = taskName + " content";                              // [2]
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);                                                 // [3]

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);                                           // [4]

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));   // [5]
        addButton.click();                                                       // [6]
        Thread.sleep(2000);
        return taskName;
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);    // [1]
        driverTrello.get(TRELLO_URL);                                                // [2]

        driverTrello.findElement(By.id("user")).sendKeys("mateuszp.nowak@gmail.com");                // [3]
        //driverTrello.findElement(By.id("password")).sendKeys("MATnow!3*");		    // [4]
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();                                                                    // [5]

        Thread.sleep(4000);                                                            // [6]

        driverTrello.findElement(By.id("password")).sendKeys("MATnow!3*");            // [7]
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(5000);                                                            // [8]

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()  // [9]
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)  // [10]
                .forEach(WebElement::click);                                                // [11]

        Thread.sleep(4000);                                                            // [12]

        result = driverTrello.findElements(By.xpath("//span")).stream()                // [13]
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));                    // [14]

        driverTrello.close();                                                        // [15]

        return result;                                                                // [16]
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();                                         // [1]

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;   // [2]

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()           // [3]
                .filter(anyForm ->                                             // [4]
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")) // [5]
                                .getText().equals(taskName))                        // [6]
                .forEach(theForm -> {                                          // [7]
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));    // [8]
                    Select select = new Select(selectElement);                 // [9]
                    select.selectByIndex(1);                                   // [10]

                    WebElement buttonCreateCard =                              // [11]
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]")); // [12]
                    buttonCreateCard.click();                                  // [13]
                });

        Thread.sleep(3000);
        driver.switchTo().alert().accept();// [14]// [15]
        driver.navigate().to(BASE_URL);
        Thread.sleep(2000);

    }

    public void deleteTask(String taskName) throws InterruptedException {
        //WebDriver deleteDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        //deleteDriver.get(BASE_URL);
        Thread.sleep(2000);
        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(task -> task.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(task -> {
                    //WebElement deleteButton = task.findElement(By.xpath(".//button[text()=\"Delete\"]"));
                    WebElement deleteButton = task.findElement(By.xpath(".//button[text()=\"Delete\"]"));
                    deleteButton.click();
                });
        Thread.sleep(4000);

    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        deleteTask(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));

    }
}
