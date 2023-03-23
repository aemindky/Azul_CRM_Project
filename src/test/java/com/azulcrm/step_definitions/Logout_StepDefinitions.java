package com.azulcrm.step_definitions;

import com.azulcrm.pages.AzulCRMHomePage;
import com.azulcrm.pages.AzulCRMLoginPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_StepDefinitions {

    AzulCRMLoginPage azulCRMLoginPage = new AzulCRMLoginPage();
    AzulCRMHomePage azulCRMHomePage = new AzulCRMHomePage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://qa.azulcrm.com");
        azulCRMLoginPage.inputUsername.sendKeys("hr11@cybertekschool.com");
        azulCRMLoginPage.inputPassword.sendKeys("UserUser");
        azulCRMLoginPage.loginBtn.click();
    }

    @When("The user clicks on logout button in the profile menu")
    public void the_user_clicks_on_logout_button_in_the_profile_menu() {
        azulCRMHomePage.dashboardUsername.click();
        azulCRMHomePage.logout.click();
    }
    @Then("The user ends up in Login page")
    public void the_user_ends_up_in_login_page() {
        azulCRMLoginPage.loginBtn.isDisplayed();
    }

    @When("The user clicks on step-back button in the browser")
    public void the_user_clicks_on_step_back_button_in_the_browser() {
        Driver.getDriver().navigate().back();
    }

    @When("The user closes all the open tabs and navigates to the login page")
    public void the_user_closes_all_the_open_tabs_and_navigates_to_the_login_page() {
        azulCRMHomePage.dashboardUsername.click();
        azulCRMHomePage.logout.click();
        Driver.closeDriver();
        Driver.getDriver().get("https://qa.azulcrm.com");
    }



}
