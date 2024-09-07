package com.framework.hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.framework.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private static ExtentReports extentReports;
    private static ExtentTest test;

    @Before
    public void setUp() {
        // Initialize WebDriver
        DriverFactory.getDriver();
        // Initialize the ExtentReports
        if (extentReports == null) { // Ensure it's initialized only once
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./extent-report.html");
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }

        // Additional setup
        System.out.println("Setup method executed.");
    }

    @After
    public void tearDown() {
        // Quit WebDriver
        DriverFactory.quitDriver();

        // Flush the reports
        if (extentReports != null) {
            extentReports.flush();
        }

        System.out.println("Teardown method executed.");
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void setTest(ExtentTest test) {
        Hooks.test = test;
    }
}
