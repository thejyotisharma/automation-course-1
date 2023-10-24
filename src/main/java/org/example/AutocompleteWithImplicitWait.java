package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutocompleteWithImplicitWait {

    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("cloudnine");
        driver.findElement(By.cssSelector("ul>li")).click();

        Thread.sleep(5000);
        driver.quit();
    }

}
