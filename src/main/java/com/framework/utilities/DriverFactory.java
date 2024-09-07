package com.framework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Initialize the WebDriver instance (e.g., ChromeDriver)
            driver = new ChromeDriver();
        }
        driver.get("https://www.demoblaze.com"); // Replace with your login page URL
        driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
