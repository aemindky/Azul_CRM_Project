package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AzulCRMHomePage {

    public AzulCRMHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement dashboardUsername;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;


}
