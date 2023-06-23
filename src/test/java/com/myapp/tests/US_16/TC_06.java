package com.myapp.tests.US_16;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;

public class TC_06 {

    ReusableMethods reusableMethods = new ReusableMethods();
    MediaUtils takeScreenShot = new MediaUtils();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();

    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();

    @Test
    public void addSimpleProductAsAVendor() throws IOException {

///        1_Go to https://pearlymarket.com/
        reusableMethods.signIn();

//        2_User should navigate to Store Manager
        reusableMethods.scrollPageEndActions();
        pmHomePage.myAccountButton.click();
        pmHomePage.storeManagerButton.click();
        pmHomePage.myStoreProductsElement.click();

//        3_Click on Product button
        reusableMethods.hoverOverOnElementActions(pmHomePage.myStoreProductsElement);

//        4_Click on Add New button and fill necessary fields
        pmHomePage.productsAddnewElement.click();
        pearlyMarketAddProductPage.virtualBox.click();
        pearlyMarketAddProductPage.downloadableBox.click();
        pearlyMarketAddProductPage.priceBox.sendKeys("10");
        pearlyMarketAddProductPage.salePriceBox.sendKeys("10");
        pearlyMarketAddProductPage.productTitleBox.sendKeys("tea cup set");

        //kitchen ve ibrahim beyin alanlarını yükle


//       5_Then user should click on SUBMIT Button
        pearlyMarketAddProductPage.submitButton.click();

//      6_Then user should see Edit Product(Published) on the page
        assertTrue(pearlyMarketAddProductPage.publishedText.getText().contains("Published"));




    }
}