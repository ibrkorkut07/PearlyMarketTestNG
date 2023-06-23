package com.myapp.tests.US_11;
import com.myapp.pages.My_Account_2Page;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import org.testng.annotations.Test;

public class TC_02 {

//    1_Go to https://pearlymarket.com/
//    2_Click on Sign in
//    3_User should enter Email
//    4_User should enter the password
//    5_Click on SIGN In button
//    6_Dashboard and options below should appear

    @Test
    public void US11_TC02(){

//        1_Go to https://pearlymarket.com/

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));
        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketRegisterPage pearlyMarketRegisterPage = new PearlyMarketRegisterPage();
        PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();
        My_Account_2Page my_account_2Page = new My_Account_2Page();

 //        2_Click on Sign in
        pearlyMarketHomePage.homePageSignInLink.click();

//        3_User should enter Email
        my_account_2Page.userName.sendKeys(ConfigReader.getProperty("PMValidUsername"));

//        4_User should enter the password
        my_account_2Page.password.sendKeys(ConfigReader.getProperty("PMValidPassword"));

//        5_Click on SIGN In button
        my_account_2Page.signIn.click();

//        6_Click on Sign Out button
        pearlyMarketHomePage.signOutLink.click();

//        6_Dashboard and options below should appear
        pearlyMarketMyAccountPage.dashboardLink.isDisplayed();
        pearlyMarketMyAccountPage.storeManagerLink.isDisplayed();
        pearlyMarketMyAccountPage.ordersLink.isDisplayed();
        pearlyMarketMyAccountPage.downloadsLink.isDisplayed();
        pearlyMarketMyAccountPage.addressesLink.isDisplayed();
        pearlyMarketMyAccountPage.accountDetailsLink.isDisplayed();
        pearlyMarketMyAccountPage.wishlistLink.isDisplayed();
        pearlyMarketMyAccountPage.supportTicketsLink.isDisplayed();
        pearlyMarketMyAccountPage.followingsLink.isDisplayed();
        pearlyMarketMyAccountPage.logoutLink.isDisplayed();


}
        }

