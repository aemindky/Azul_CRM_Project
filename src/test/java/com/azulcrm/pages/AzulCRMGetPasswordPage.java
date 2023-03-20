package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AzulCRMGetPasswordPage {

    public AzulCRMGetPasswordPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement getPassword;

}
