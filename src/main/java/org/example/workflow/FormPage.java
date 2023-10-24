package org.example.workflow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    public static void run(WebDriver driver){

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Jyoti");

        driver.findElement(By.cssSelector("#last-name")).sendKeys("Sharma");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Automation Engineer");

        driver.findElement(By.cssSelector("#radio-button-3")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();


        WebElement autocomplete = driver.findElement(By.id("select-menu"));
        autocomplete.click();

        WebElement selectMenu = driver.findElement(By.cssSelector("option[value='2']"));
        selectMenu.click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("10/22/2023");
        datePicker.sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }
}
