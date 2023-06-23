package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyMarketVendorRegisterPage {
    public PearlyMarketVendorRegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='wcfm_email_verified_input']")
    public WebElement verifCodeBox;

    @FindBy(id = "passoword")
    public WebElement passwordBox;

    @FindBy(id = "confirm_pwd")
    public WebElement confirmPasswordBox;

    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Too short']")
    public WebElement tooShortText;

    @FindBy(xpath ="//*[text()='Weak']" )
    public WebElement weakText;

    @FindBy(xpath = "//*[text()='Good']")
    public WebElement goodText;

    @FindBy(xpath = "//*[text()='Strong']")
    public WebElement strongText;

    @FindBy(xpath = "//*[text()='Email: This field is required.']")
    public WebElement emailRequiredText;

    @FindBy(xpath = "(//div[@tabindex='-1'])[1]")
    public WebElement verificationCodeSentBox;

    @FindBy(id="password_strength")
    public WebElement levelChart;

    @FindBy(xpath = "(//div[@tabindex='-1'])[2]")
    public WebElement registeredMessage;

    @FindBy(partialLinkText = "right")
    public WebElement notRightNowLink;

    @FindBy(xpath = "//*[text()='Email verification code invalid.']")
    public WebElement invalidVerifCode;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement verifCodeRequired;

    @FindBy(xpath = "//*[text()='Please provide a valid email address.']")
    public WebElement invalidEmailText;

    @FindBy(className = "wcfm-message wcfm-error")
    public WebElement unmatchedPassword;
    @FindBy(xpath = "//*[@class='wcicon-status-cancelled']")
    public WebElement alreadyExistMail;





}