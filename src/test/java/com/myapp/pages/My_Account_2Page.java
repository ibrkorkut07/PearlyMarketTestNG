package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_2Page {
    public My_Account_2Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[.='Sign In']")
    public WebElement signIn;

    @FindBy(partialLinkText = "Store Manager")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement signIn2;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;


}