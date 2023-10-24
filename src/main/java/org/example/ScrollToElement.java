package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScrollToElement {
    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement element = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("17/10/2023");





        Thread.sleep(5000);

        driver.quit();

    }
}
