package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

    public static void run() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor executor;
        driver.get("http://formy-project.herokuapp.com/modal");

        executor = (JavascriptExecutor) driver;
        executor.executeAsyncScript("confirm('hello');");

        Thread.sleep(5000);
        driver.quit();
    }

}
