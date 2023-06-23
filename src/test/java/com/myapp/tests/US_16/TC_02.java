package com.myapp.tests.US_16;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_02 {

    ReusableMethods reusableMethods = new ReusableMethods();
    MediaUtils takeScreenShot = new MediaUtils();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();

    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();

    @Test
    public void addSimpleProductAsAVendor () throws IOException {

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
//
////        5_When User click Virtual and Downloadable box there should be thick.
        pearlyMarketAddProductPage.virtualBox.click();
        pearlyMarketAddProductPage.downloadableBox.click();

        takeScreenShot.takeScreenshotOfTheEntirePage();

    }
}
