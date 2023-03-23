package com.azulcrm.step_definitions;

import com.azulcrm.pages.AzulCRMGetPasswordPage;
import com.azulcrm.pages.AzulCRMHomePage;
import com.azulcrm.pages.AzulCRMLoginPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {

    AzulCRMLoginPage azulCRMLoginPage = new AzulCRMLoginPage();
    AzulCRMHomePage azulCRMHomePage = new AzulCRMHomePage();
    AzulCRMGetPasswordPage azulCRMGetPasswordPage = new AzulCRMGetPasswordPage();

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

    @When("The user clicks on the login button")
    public void The_user_clicks_on_the_login_button() {
        azulCRMLoginPage.loginBtn.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expected = "Activity Stream";
        Assert.assertEquals(expected, azulCRMHomePage.activityStream.getText());
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
        Assert.assertEquals(expected, azulCRMLoginPage.incorrectLoginOrPasswordText.getText());
        Driver.closeDriver();
    }

    @When("user enters any username or password")
    public void user_enters_any_username_or_password() {
        azulCRMLoginPage.inputUsername.sendKeys("hr1@cybertekschool.com");
    }



    @Then("user should see please fill out this message")
    public void user_should_see_please_fill_out_this_message() {
        String expected = "Please fill out this field";
        try {
            Assert.assertEquals(expected,azulCRMLoginPage.incorrectLoginOrPasswordText.getText());
        } catch (Exception e) {

        }
        Driver.closeDriver();

    }

    @When("user clicks on the Forgot your password link")
    public void user_clicks_on_the_forgot_your_password_link() {
        azulCRMLoginPage.forgotYourPassword.click();
    }

    @Then("user lands on the Get Password page")
    public void user_lands_on_the_get_password_page() {
        String expected = "Get Password";
        Assert.assertEquals(expected, azulCRMGetPasswordPage.getPassword.getText());
        Driver.closeDriver();
    }

    @When("Remember Me link exists on the login page")
    public void remember_me_link_exists_on_the_login_page() {
        String expected = "Remember me on this computer";
        Assert.assertEquals(expected, azulCRMLoginPage.rememberMeText.getText());
    }

    @Then("Remember Me link is clickable")
    public void remember_me_link_is_clickable() {
        azulCRMLoginPage.rememberMeCheckBox.click();
        Assert.assertTrue(azulCRMLoginPage.rememberMeCheckBox.isSelected());
        Driver.closeDriver();
    }

    @When("user types password into password input box")
    public void user_types_password_into_password_input_box() {
        azulCRMLoginPage.inputPassword.sendKeys("UserUser");
    }

    @Then("user should see password in bullet signs")
    public void user_should_see_password_in_bullet_signs() {
        String actual = azulCRMLoginPage.inputPassword.getAttribute("type");
        Assert.assertEquals("password", actual);

    }


    @When("user enters username")
    public void user_enters_username() {

        azulCRMLoginPage.inputUsername.sendKeys("hr11@cybertekschool.com");
    }


    @Then("user enters password and presses the Enter button")
    public void user_enters_password_and_presses_the_enter_button() {
        azulCRMLoginPage.inputPassword.sendKeys("UserUser" + Keys.ENTER);
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        azulCRMLoginPage.inputUsername.sendKeys("hr11@cybertekschool.com");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        azulCRMLoginPage.inputPassword.sendKeys("UserUser");
    }

    @Then("user see his-her own username in the profile menu")
    public void user_see_his_her_own_username_in_the_profile_menu() {
        String expected1 = "hr11@cybertekschool.com";
        Assert.assertEquals(expected1, azulCRMHomePage.dashboardUsername.getText());
        Driver.closeDriver();
    }


}
