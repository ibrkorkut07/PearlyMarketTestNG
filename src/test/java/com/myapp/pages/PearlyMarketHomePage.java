package com.myapp.pages;

import com.myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PearlyMarketHomePage {
    public PearlyMarketHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    /*
       After click to SignIn/Register then ALERT appears.
       And In Alert we have SIGN UP and SIGN IN parts
       */
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement homepageSignInButton;
    @FindBy(xpath = "//span[text()='Register']")
    public WebElement homepageRegisterButton;

    // ************** SIGN IN / SIGN UP **********
    @FindBy(xpath = "//input[@id='username']")// for SIGN IN & SIGN UP
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='password']")// for SIGN IN
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@id='reg_password']")// for SIGN UP
    public WebElement signUpPasswordBox;
    @FindBy(xpath = "//input[@id='reg_email']")// for SIGN UP
    public WebElement emailBox;
    @FindBy(id= "rememberme")// for SIGN IN
    public WebElement rememberMe;
    @FindBy(id= "'register-policy") // for SIGN UP
    public WebElement registerPolicy; // To select "I agree to the privacy policy"
    @FindBy(xpath = "//button[@name='login']") // for SIGN IN
    public WebElement loginButton;
    @FindBy(xpath = "//button[@name='register']")// for SIGN UP
    public WebElement signUpButton;
    // *********************************************
    @FindBy(xpath = "/html/body/div[2]/footer/div/section[2]/div/div[2]/div/section/div/div[2]/div/div[2]/div/nav/ul/li[4]")
    public WebElement myAccountButton;
    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;
    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[3]")
    public WebElement myStoreProductsElement;
    @FindBy(xpath = "(//span[@class='text'])[18]")
    public WebElement productsAddnewElement;
    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement homePageSignInLink;
    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutLink;
    @FindBy(xpath = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]")
    public WebElement clickAProductAsAVendor;
    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToChartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement chartButton;
    @FindBy(xpath = "//a[.='View cart']")
    public WebElement viewChartButton;

    @FindBy(xpath = "(//a[.='Checkout'])[2]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstNameElement;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastNameElement;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement companyNameElement;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddressElement;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    public WebElement streetAddressContinueElement;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postCodeZipElement;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement townCityElement;

    @FindBy(xpath = "//input[@id='select2-billing_state-container']")
    public WebElement provinceElement;

    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement phoneElement;

    @FindBy(xpath = "//label[@for='payment_method_cod']")
    public WebElement payAtTheDoorElement;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderElement;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderCompleteMessageElement;
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[7]/a/span[2]")
    public WebElement couponsButton;

}