package com.framework.step_definitions;

import com.framework.PageObjects.LoginPage;
import com.framework.utilities.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class LoginSteps{


    private WebDriver driver  = DriverFactory.getDriver();
    private LoginPage loginPage  = new LoginPage(driver);
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.clickOnLogIn();
    }

    @When("I enter valid UserName")
    public void iEnterValidUserName() {
        loginPage.enterUsername("MaysoonMMMMM");
    }

    @When("I enter valid Password")
    public void iEnterValidPassword() {
        loginPage.enterPassword("Maysoon123434");
    }
    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the home page")
    public void iShouldSeeTheHomePage() {
        Assert.assertEquals(loginPage.getAlertMessage(), "Log In successful."); // Validate the alert message

    }


}
