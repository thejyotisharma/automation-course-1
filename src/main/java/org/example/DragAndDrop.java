package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void run() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4");


        WebElement net = driver.findElement(By.id("gate"));

        WebElement ball = driver.findElement(By.id("ball"));
        Actions action = new Actions(driver);
        action.dragAndDrop(ball,net).perform();

        Thread.sleep(5000);
        driver.quit();

    }
}
