package com.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        System.out.println("I am the base page ");
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initializes elements on the page
    }

}
