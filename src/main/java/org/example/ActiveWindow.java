package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveWindow {

    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/switch-window");
        String firstWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("new-tab-button")).click();
        Thread.sleep(2000);

        driver.switchTo().window(firstWindowHandle);
        Thread.sleep(5000);

        driver.quit();

    }

}
