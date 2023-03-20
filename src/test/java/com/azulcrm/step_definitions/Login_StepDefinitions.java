package com.azulcrm.step_definitions;

import com.azulcrm.pages.AzulCRMHomePage;
import com.azulcrm.pages.AzulCRMLoginPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class Login_StepDefinitions {

AzulCRMLoginPage azulCRMLoginPage = new AzulCRMLoginPage();
AzulCRMHomePage azulCRMHomePage = new AzulCRMHomePage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://qa.azulcrm.com");
    }

    @When("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
    azulCRMLoginPage.inputUsername.sendKeys(string);
    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
    azulCRMLoginPage.inputPassword.sendKeys(string);
    }
    @When("user enters click")
    public void user_enters_click() {
    azulCRMLoginPage.loginBtn.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Driver.closeDriver();
    }


    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String string) {
        azulCRMLoginPage.inputUsername.sendKeys(string);
    }
    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
       azulCRMLoginPage.inputPassword.sendKeys(string);
    }
    @Then("user should see incorrect login or password text")
    public void user_should_see_incorrect_login_or_password_text() {
        String expected = "Incorrect login or password";
        Assert.assertEquals(expected,azulCRMLoginPage.incorrectLoginOrPasswordText.getText());
        Driver.closeDriver();
    }

    @When("user enters any username")
    public void user_enters_any_username() {
        azulCRMLoginPage.inputUsername.sendKeys("hr1@cybertekschool.com");
    }
    @When("user enters any password")
    public void user_enters_any_password() {
        azulCRMLoginPage.inputPassword.sendKeys("");
    }
    @Then("user should see please fill out this message")
    public void user_should_see_please_fill_out_this_message() {
        String expected = "Please fill out this field";
        try {
            Assert.assertEquals(expected,azulCRMLoginPage.incorrectLoginOrPasswordText.getText());
        } catch (Exception e) {
            throw new NoSuchElementException();

        }
        Driver.closeDriver();

    }
}
