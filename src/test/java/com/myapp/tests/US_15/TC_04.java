package com.myapp.tests.US_15;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. Go to https://pearlymarket.com/
2. Sign in
3. Go to "Add New" page
4. Scroll down to "Attributes" & click on
5. Click on "Color" check box
6. Choose an option from "Color" drop-down menu
7. Click on "SUBMIT" button on the right bottom corner
*/

public class TC_04 {

    ReusableMethods reMethods = new ReusableMethods();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();
    PearlyMarketAddProductPage pmAddProductPage = new PearlyMarketAddProductPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    Select selectColor;

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
        // reMethods.scrollIntoView(pmAddProductPage.applephoneCheckboxInCategories);
        reMethods.scrollDownActions();
        reMethods.scrollDownActions();

        // pmAddProductPage.addProductAttributesBox.click();
        executor.executeScript("arguments[0].click();", pmAddProductPage.addProductAttributesBox);
        executor.executeScript("arguments[0].click();", pmAddProductPage.attributesColorCheckBox);
        // pmAddProductPage.attributesColorCheckBox.click();
        selectColor = new Select(pmAddProductPage.attributesColorDropdown);
        selectColor.selectByVisibleText("Blue");
        // pmAddProductPage.attributesColorBox.sendKeys("Navy Blue");
        reMethods.scrollDownActions();
        pmAddProductPage.addProductSubmitButton.click();

    }

}