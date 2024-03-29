package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static final String XPAHT_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea"; // [1]
    public static final String XPATH_SELECT = "//select[1]";
    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://matnow138.github.io");

        WebElement searchField = driver.findElement(By.xpath(XPAHT_INPUT));
        searchField.sendKeys("New Robotic task");

        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));  // [2]
        textareaField.sendKeys("The robotic content");

        while(!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());
        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));      // [2]
        Select selectBoard = new Select(selectCombo);                             // [3]
        selectBoard.selectByIndex(1);
    }
}
