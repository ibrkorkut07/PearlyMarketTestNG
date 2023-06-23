package com.myapp.tests.US_17;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.JSUtils;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;


public class TC_08 {
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
        reusableMethods.scrollPageEndActions();
        pearlyMarketMyAccountPage.goShopLink.click();

//      5_Then user should click on Chart button
        pmHomePage.chartButton.click();
        pmHomePage.viewChartButton.click();

//      6_Then user should click on CHECKOUT button
        pmHomePage.checkoutButton.click();

//      7_Then user should click on PLACE ORDER
        pmHomePage.firstNameElement.sendKeys("Nurullah");
        pmHomePage.lastNameElement.sendKeys("Kaleli");
        pmHomePage.companyNameElement.sendKeys("Nese");
        pmHomePage.streetAddressElement.sendKeys("Selcuklu");
        pmHomePage.streetAddressContinueElement.sendKeys("Yazır");
        pmHomePage.postCodeZipElement.sendKeys("42000");
        pmHomePage.townCityElement.sendKeys("Konya");
//        pmHomePage.provinceElement.click();
//        ReusableMethods.selectByVisibleText(pmHomePage.provinceElement,"Konya");
        pmHomePage.phoneElement.sendKeys("11212122");

        JSUtils.clickWithTimeoutByJS(pmHomePage.payAtTheDoorElement);
        JSUtils.clickWithTimeoutByJS(pmHomePage.placeOrderElement);
        assertTrue(pmHomePage.orderCompleteMessageElement.getText().contains("Thank you. Your order has been received."));





    }
}