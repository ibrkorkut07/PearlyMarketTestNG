package com.myapp.tests.US_12;

import com.myapp.pages.AddressesPage;
import com.myapp.pages.My_Account_2Page;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class TC_02 {
//    1_Go to https://pearlymarket.com/
//    2_User should SIGN IN
//    3_Click on Sign Out button
//    4_Dashboard and options below should appear
//    5_Click on Addresses
//    6_Then click on Add below Billing Address
//    7_The registered email must be filled automatically.

    @Test
    public void US12_TC02(){

//        1_Go to https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();
        My_Account_2Page my_account_2Page = new My_Account_2Page();
        AddressesPage addressesPage = new AddressesPage();

//        2_Click on Sign in
        pearlyMarketHomePage.homePageSignInLink.click();
        my_account_2Page.userName.sendKeys("isam.young@fullangle.org");
        my_account_2Page.password.sendKeys("Meyra123!");
        my_account_2Page.signIn.click();

//        3_Click on Sign Out button
        pearlyMarketHomePage.signOutLink.click();

//        4_Dashboard and options below should appear
        pearlyMarketMyAccountPage.myAccountText.isDisplayed();

//        5_Click on Addresses
        pearlyMarketMyAccountPage.addressesLink.click();

//        6_Then click on Add below Billing Address
        addressesPage.addBillingButton.click();

//        7_The registered email must be filled automatically.
//        String billingEmail=ConfigReader.getProperty("billing_email").toString();
        addressesPage.billingEmail.getText().contains("@");


}

}
