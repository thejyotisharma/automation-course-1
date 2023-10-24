package org.example.workflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkFlow {

    public static void run() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage.run(driver);
        AlertPage.run(driver);

        Thread.sleep(5000);
        driver.quit();

    }

}
