package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyTextBox {

    public static void Run() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement element = driver.findElement(By.id("name"));
        element.sendKeys(" I love myself ❤\uFE0F");

        WebElement element1 = driver.findElement(By.id("button"));
        element1.click();

        Thread.sleep(5000);
        driver.quit();
    }

}
