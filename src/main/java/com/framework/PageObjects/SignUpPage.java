package com.framework.PageObjects;

import com.framework.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage extends BasePage {

    //constructor
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //locators
    private By signUpLink = By.id("signin2");
    private By signUpUserName = By.id("sign-username");
    private By signUpPassword = By.id("sign-password");
    private By SignUpBtn= By.xpath("//button[text()='Sign up']");




    // Methods to interact with the login page
    public void clickOnSignUp() {
        WebElement signUpModuleElement = driver.findElement(signUpLink);
        signUpModuleElement.click();
    }

    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(signUpUserName);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String username) {
        WebElement passwordElement = driver.findElement(signUpPassword);
        passwordElement.sendKeys(username);
    }

    public void clickOnsignUpBtn(){
        WebElement signUpBtnElement = driver.findElement(SignUpBtn);
        signUpBtnElement.click();
    }

    public String getAlertMsg(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();  // Get the text of the alert
        return alertMessage;
    }

}
