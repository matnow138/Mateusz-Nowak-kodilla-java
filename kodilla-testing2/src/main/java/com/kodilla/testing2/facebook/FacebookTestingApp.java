package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp  {
    public static String name = "firstname";

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        driver.findElement(By.xpath("//*[contains(@id, 'u_0_e')]")).click();
        driver.findElement(By.xpath("//*[contains(@id, 'u_0_0_')]")).click();

        Thread.sleep(1000);
       // while(!driver.findElement(By.xpath("//*[contains(@id, 'u_3_b_')]")).isDisplayed());
        WebElement searchField = driver.findElement(By.xpath("//*[contains(@id, 'u_3_b_')]"));      // [5]
        searchField.sendKeys("Jan");

        searchField = driver.findElement(By.xpath("//*[contains(@id, 'u_3_d_')]"));      // [5]
        searchField.sendKeys("Kowalski");

        searchField = driver.findElement(By.xpath("//*[contains(@id, 'u_3_g_')]"));      // [5]
        searchField.sendKeys("jan.kowalski@mail.com");

        searchField = driver.findElement(By.xpath("//*[contains(@id, 'u_3_j_')]"));      // [5]
        searchField.sendKeys("jan.kowalski@mail.com");

        searchField = driver.findElement(By.xpath("//*[contains(@id, 'password_step')]"));      // [5]
        searchField.sendKeys("Qweasd123!");

        WebElement selectCombo = driver.findElement(By.xpath("//*[@id='day']"));      // [2]
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(12);

        selectCombo = driver.findElement(By.xpath("//*[@id='month']"));      // [2]
        selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(8);

        selectCombo = driver.findElement(By.xpath("//*[@id='year']"));      // [2]
        selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(20);

        driver.findElement(By.xpath("//*[contains(@id, 'u_3_5_')]")).click();





    }
}
