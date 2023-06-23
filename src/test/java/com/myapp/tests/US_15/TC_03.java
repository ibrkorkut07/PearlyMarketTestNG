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
4. Scroll down to Shipping & click on
5. Enter a weight value into "Weight (kg)" box
6. Enter "Length", "Width" & "Height" values into relative "Dimensions (cm)" boxes
7. Choose an option from "Shipping class" drop-down menu
8. Choose an option from "Processing Time" drop-down menu
9. Click on "SUBMIT" button on the right bottom corner
*/

public class TC_03 {

    ReusableMethods reMethods = new ReusableMethods();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();
    PearlyMarketAddProductPage pmAddProductPage = new PearlyMarketAddProductPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    Select selectShippingClass;
    Select selectShippingProcessingtime;

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

        executor.executeScript("arguments[0].click();", pmAddProductPage.addProductShippingBox);
        // pmAddProductPage.addProductShippingBox.click();
        pmAddProductPage.shippingWeightBox.sendKeys("3");
        pmAddProductPage.shippingLengthBox.sendKeys("33");
        pmAddProductPage.shippingWidthBox.sendKeys("22");
        pmAddProductPage.shippingHeightBox.sendKeys("11");
        selectShippingClass = new Select(pmAddProductPage.shippingShippingclassDropdown);
        selectShippingClass.selectByIndex(0);
        reMethods.scrollDownActions();
        selectShippingProcessingtime = new Select(pmAddProductPage.shippingProcessingtimeDropdown);
        selectShippingProcessingtime.selectByIndex(1);
        executor.executeScript("arguments[0].click();", pmAddProductPage.shippingSubmitButton);

    }

}