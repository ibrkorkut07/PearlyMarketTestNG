package com.myapp.tests.US_14;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
1. Go to https://pearlymarket.com/
2. Click on Sign in
3. Enter "Username or email address"
4. Enter "Password" 
5. Click on "SIGN IN"
6. Click on "Store Manager"
7. Click on "Products" & "Add New"
8. Click on the dropdown menu starting with "Simple Product"
9. Click on each "Simple Product", "Variable Product", "Grouped Product" & "External - Affiliate Product" elements & test whether they are displayed or not
*/

public class TC_01 {

    ReusableMethods reMethods = new ReusableMethods();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();
    PearlyMarketAddProductPage pmAddProductPage = new PearlyMarketAddProductPage();

    @Test
    public void addNewProductMenuTest(){
        reMethods.signIn();
        reMethods.scrollPageEndActions();

        // reMethods.waitForVisibility(pmHomePage.myAccountButton, 11);
        pmHomePage.myAccountButton.click();
        pmHomePage.storeManagerButton.click();
        pmHomePage.myStoreProductsElement.click();
        reMethods.hoverOverOnElementActions(pmHomePage.myStoreProductsElement);
        pmHomePage.productsAddnewElement.click();

        pmAddProductPage.dropdownProductTypeElement.click();
        Assert.assertTrue(pmAddProductPage.dropdownSimpleProductElement.isDisplayed());
        Assert.assertTrue(pmAddProductPage.dropdownVariableProductElement.isDisplayed());
        Assert.assertTrue(pmAddProductPage.dropdownGroupedProductElement.isDisplayed());
        Assert.assertTrue(pmAddProductPage.dropdownExternalProductElement.isDisplayed());

    }

}
