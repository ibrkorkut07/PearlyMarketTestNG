package com.myapp.tests.US_16;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_04 {

    ReusableMethods reusableMethods = new ReusableMethods();
    MediaUtils takeScreenShot = new MediaUtils();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();


    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();

    @Test
    public void addSimpleProductAsAVendor() throws IOException {

//        1_Go to https://pearlymarket.com/
        reusableMethods.signIn();

//        2_User should navigate to Store Manager
        reusableMethods.scrollPageEndActions();
        pmHomePage.myAccountButton.click();
        pmHomePage.storeManagerButton.click();
        pmHomePage.myStoreProductsElement.click();

//        3_Click on Product button
        reusableMethods.hoverOverOnElementActions(pmHomePage.myStoreProductsElement);

//        4_Click on Add New button
        pmHomePage.productsAddnewElement.click();

//        5_When User write product title it should be seen in the box
       pearlyMarketAddProductPage.productTitleBox.sendKeys("tea cup set");

        takeScreenShot.takeScreenshotOfTheEntirePage();


    }
}