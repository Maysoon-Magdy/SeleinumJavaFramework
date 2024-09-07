package com.framework.base;

import org.openqa.selenium.WebDriver;
import com.framework.utilities.DriverFactory;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected DriverFactory driverFactory;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        System.out.println("I am the base test ");
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver(); // Initialize WebDriver
        System.out.println("Driver initialized: " + (driver != null)); // Debugging line
        driver.manage().window().maximize(); // Maximize the browser window
    }
@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Clean up WebDriver
        }
    }
}
