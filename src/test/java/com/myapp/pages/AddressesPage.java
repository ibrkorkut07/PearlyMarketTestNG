package com.myapp.pages;

import com.myapp.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {
    public AddressesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[.='Add'])[1]")
    public WebElement addBillingButton;
    @FindBy(xpath = "(//a[.='Add'])[2]")
    public WebElement addShippingButton;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement billingFirstName;
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement billingLastName;
    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement shippingLastName;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement billingCountry;
    @FindBy(xpath = "//*[@id='select2-shipping_country-container']")
    public WebElement shippingCountry;

    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//*[@id='shipping_city']")
    public WebElement shippingCity;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement billingZipCode;
    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement shippingZipCode;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement billingPhone;
    @FindBy(xpath = "//*[@name='billing_email']")
    public WebElement billingEmail;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement billingStreetAddress;
    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement shippingStreetAddress;
    @FindBy(xpath = "//*[@id='billing_state']")
    public WebElement billingState;
    @FindBy(xpath = "//*[@id=shipping_state']")
    public WebElement shippingState;
    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement billingSaveAddressButton;
    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement shippingSaveAddressButton;
    @FindBy(xpath = "//a[text()='Edit Your Billing Address']")
    public WebElement editBillingAddress;

    @FindBy(xpath = "//a[text()='Edit Your Shipping Address']")
    public WebElement editShippingAddress;

    @FindBy(xpath = "//li[@data-id='shipping_first_name']")
    public WebElement firstNameRequiredText;

    @FindBy(xpath = "//li[@data-id='shipping_last_name']")
    public WebElement lastNameRequiredText;
    @FindBy(xpath = "//li[@data-id='shipping_country']")
    public WebElement countryRequiredText;
    @FindBy(xpath = "//li[@data-id='shipping_address_1']")
    public WebElement addressRequiredText;
    @FindBy(xpath = "//li[@data-id='shipping_city']")
    public WebElement cityRequiredText;
    @FindBy(xpath = "//li[@data-id='shipping_state']")
    public WebElement stateRequiredText;

    @FindBy(xpath = "//li[@data-id='shipping_postcode']")
    public WebElement postCodeRequiredText;










}
