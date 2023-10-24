package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

public class AutocompleteWithExplicitWait {

    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("cloudnine");

        // Add explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement listItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul>li")));

        listItem.click();

        assertEquals("","");

        Thread.sleep(5000);
        driver.quit();
    }

}
