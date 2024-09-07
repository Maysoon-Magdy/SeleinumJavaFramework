package com.framework.step_definitions;

import com.framework.PageObjects.SignUpPage;
import com.framework.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class SignUpSteps {
    private WebDriver driver  = DriverFactory.getDriver();
    private SignUpPage signUpPage = new SignUpPage(driver);

    @Given("I am on the Sign Up page")
   public void IAmOnTheSignUpPage() {
       signUpPage.clickOnSignUp();
   }

    @When("I enter a valid username")
    public void iEnterAValidUsername() {
        signUpPage.enterUsername("MaysoonMMMMM");
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        signUpPage.enterPassword("Maysoon123434");
    }

    @And("I click the Sign Up button")
    public void iClickTheSignUpButton() {
        signUpPage.clickOnsignUpBtn();
    }

    @Then("I should be signed up successfully")
    public void iShouldBeSignedUpSuccessfully() {
        Assert.assertEquals(signUpPage.getAlertMsg(), "Sign up successful."); // Validate the alert message

    }
}
