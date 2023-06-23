package com.myapp.tests.US_16;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.ReusableMethods;
import com.myapp.utilities.WaitUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class TC_01 {

    ReusableMethods reusableMethods = new ReusableMethods();


    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();
    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();


    @Test
    public void addSimpleProductAsAVendor (){

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

//        5_Simple Product should be default.
        String text = pearlyMarketAddProductPage.simpleProductButton.getText();
        assertTrue(text.contains("Simple Product"));

    }
}
