package com.myapp.tests.US_14;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/*
1. Go to https://pearlymarket.com/
2. Sign in
3. Go to "Add New" page
4. Click on "+Add new category" link under "Categories" on the right
5. Type a category name in "Category Name" box
6. Choose a category from "Parent Category" drop-down element
7. Click "ADD" button
*/

public class TC_05 {

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


        pmAddProductPage.addNewCategoryLink.click();
        reMethods.scrollDownActions();
        pmAddProductPage.categoryNameBox.click();
        pmAddProductPage.categoryNameBox.sendKeys("Glasses");
        Select selectParentCategory=new Select(pmAddProductPage.parentCategoryDropdownElement);
        selectParentCategory.selectByVisibleText("Best Seller");
        pmAddProductPage.productCategoryAddButton.click();

    }

}
