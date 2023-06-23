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
4. Scroll down to Inventory & click on
5. Enter a SKU value into SKU box
6. Click on "Manage Stock?" check box
7. Enter a quantity into "Stock Qty" box
8. Uncheck "Manage Stock?" check box
9. Choose an option from "Stock status" drop-down menu
10. Click on "Sold Individually" check box
11. Click on "SUBMIT" button on the right bottom corner
*/

public class TC_02 {

    ReusableMethods reMethods = new ReusableMethods();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();
    PearlyMarketAddProductPage pmAddProductPage = new PearlyMarketAddProductPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

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
        reMethods.scrollDownActions();

        pmAddProductPage.addProductInventoryBox.click();
        pmAddProductPage.skuValueBox.sendKeys("1907");
        pmAddProductPage.manageStockClickBox.click();
        pmAddProductPage.stockqtyBox.sendKeys("11");
        pmAddProductPage.manageStockClickBox.click();
        Select selectStockStatus = new Select(pmAddProductPage.stockstatusDropdown);
        selectStockStatus.selectByVisibleText("On backorder");
        pmAddProductPage.soldIndividuallyBox.click();
        pmAddProductPage.addProductSubmitButton.click();



    }

}

/*
5. Enter a SKU value into SKU box
6. Click on "Manage Stock?" check box
7. Enter a quantity into "Stock Qty" box
8. Uncheck "Manage Stock?" check box
9. Choose an option from "Stock status" drop-down menu
10. Click on "Sold Individually" check box
11. Click on "SUBMIT" button on the right bottom corner
*/