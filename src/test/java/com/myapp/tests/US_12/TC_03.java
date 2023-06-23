package com.myapp.tests.US_12;

import com.myapp.pages.AddressesPage;
import com.myapp.pages.My_Account_2Page;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import org.testng.annotations.Test;

public class TC_03 {
//    1_Go to https://pearlymarket.com/
//    2_User should SIGN IN
//    3_Dashboard and options below should appear
//    4_Click on Addresses
//5_Then click on Add below Billing Address
//6_The registered email must be filled automatically.
//7_Red dotted fields must be filled
//8_Then Save Address button must be click.
//9_Address should be added.

    @Test
    public void US12_TC03(){

//        1_Go to https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();
        My_Account_2Page my_account_2Page = new My_Account_2Page();
        AddressesPage addressesPage = new AddressesPage();

//        2_Click on Sign in
        pearlyMarketHomePage.homePageSignInLink.click();

//        3_User should enter Email
        my_account_2Page.userName.sendKeys("isam.young@fullangle.org");

//        4_User should enter the password
        my_account_2Page.password.sendKeys("password123");

//        5_Click on SIGN In button
        my_account_2Page.signIn.click();

//        6_Click on Sign Out button
        pearlyMarketHomePage.signOutLink.click();

//        7_‘My Account’ on the page should appear
        pearlyMarketMyAccountPage.myAccountText.isDisplayed();

//        8_Click on Addresses
        pearlyMarketMyAccountPage.addressesLink.click();

//        9_Then click on Add below Billing Address
        addressesPage.addBillingButton.click();

//        10_Red dotted fields must be filled
        addressesPage.billingFirstName.sendKeys(ConfigReader.getProperty("billing_firstname"));
        addressesPage.billingLastName.sendKeys(ConfigReader.getProperty("billing_lastname"));
//        ReusableMethods.selectByVisibleText(addressesPage.billingCountry,"Iceland");
        addressesPage.billingStreetAddress.sendKeys(ConfigReader.getProperty("billing_streetaddress"));
        addressesPage.billingZipCode.sendKeys(ConfigReader.getProperty("billing_zipcode"));
        addressesPage.billingCity.sendKeys(ConfigReader.getProperty("billing_city"));
        addressesPage.billingPhone.sendKeys(ConfigReader.getProperty("billing_phone"));

//       11_Then Save Address button must be click.
        addressesPage.billingSaveAddressButton.click();

//        12_Address should be added.
        addressesPage.editBillingAddress.isDisplayed();


}

}
