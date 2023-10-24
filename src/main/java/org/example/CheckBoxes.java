package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkbox-2"));
        WebElement checkbox3 = driver.findElement(By.cssSelector("#checkbox-3"));

        checkbox1.click();
        checkbox3.click();

        Thread.sleep(5000);

        driver.quit();






    }
}
