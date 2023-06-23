package com.myapp.tests.US_17;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC_01 {
    ReusableMethods reusableMethods = new ReusableMethods();
    MediaUtils takeScreenShot = new MediaUtils();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();

    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();


    @Test
    public void shopAsAVendor() throws IOException {

//        1_Go to https://pearlymarket.com/
        reusableMethods.signIn();

//        2_User should navigate to My Account
        reusableMethods.scrollPageEndActions();
        pmHomePage.myAccountButton.click();

//      3_User should click on Orders
        pearlyMarketMyAccountPage.ordersLink.click();

//      4_Then Click on GO SHOP button
        pearlyMarketMyAccountPage.goShopLink.click();

//      5_Then product list should seen on the screen
        takeScreenShot.takeScreenshotOfTheEntirePage();

//      6_Then user should click on the product user want
        pmHomePage.clickAProductAsAVendor.click();

//      7_Then user should click on Chart button
        pmHomePage.addToChartButton.click();


    }
}