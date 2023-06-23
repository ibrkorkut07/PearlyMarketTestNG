package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyMarketRegisterPage {
    public PearlyMarketRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div//a[.='Become a Vendor']")
    public WebElement becomeAVendorLink;

    @FindBy(id = "user_email")
    public WebElement email;
    @FindBy(xpath = "//input[@placeholder='Verification Code']")
    public WebElement verificationCode;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "confirm_pwd")
    public WebElement confirmPassword;
    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerButton;

    @FindBy(partialLinkText = "Sign")
    public WebElement signUpLink;


}