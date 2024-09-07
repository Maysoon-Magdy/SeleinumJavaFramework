package com.framework.PageObjects;

import com.framework.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {


    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By LogInLink = By.id("login2");
    private By LogInUserName = By.id("loginusername");
    private By LogInPassword = By.id("loginpassword");

    private By LogInBtn= By.xpath("//button[text()='Log in']");


    // Methods to interact with the login page

    public void clickOnLogIn() {
        WebElement signUpModuleElement = driver.findElement(LogInLink);
        signUpModuleElement.click();
    }

    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(LogInUserName);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(LogInPassword);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(LogInBtn);
        loginButtonElement.click();
    }

    // Optionally, you can add methods to check for successful login or handle errors
    public String getAlertMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();  // Get the text of the alert
        return alertMessage;
    }
}
