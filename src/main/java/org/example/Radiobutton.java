package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

    public static void run() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/radiobutton");

        WebElement  Rb1 = driver.findElement(By.cssSelector("#radio-button-1"));
        WebElement  Rb2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        WebElement  Rb3 = driver.findElement(By.cssSelector ("input[value = 'option3']"));
        Rb1.click();
        Thread.sleep(5000);

        Rb2.click();
        Thread.sleep(5000);

        Rb3.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
