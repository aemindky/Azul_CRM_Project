package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AzulCRMLoginPage {

    public AzulCRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='login-inp']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeText;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginOrPasswordText;




}
