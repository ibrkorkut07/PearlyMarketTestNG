package com.myapp.tests.US_14;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

/*
1. Go to https://pearlymarket.com/
2. Sign in
3. Go to "Add New" page
4. Click in "Product Title" section & type a product title 
5. Click in "Short Description" section & type a short description 
6. Click in "Description" section & type a description
*/

public class TC_03 {

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
        reMethods.scrollIntoView(pmAddProductPage.productTitleBox);

        pmAddProductPage.productTitleBox.sendKeys("Stool");

        Driver.getDriver().switchTo().frame(pmAddProductPage.shortDescriptionIFrame);
        pmAddProductPage.shortDescriptionTextBox.sendKeys("Round 4-Leg Stool");

        Driver.getDriver().switchTo().parentFrame();   // to switch out of the previous iframe

        Driver.getDriver().switchTo().frame(pmAddProductPage.descriptionIFrame);
        pmAddProductPage.descriptionTextBox.sendKeys("It is a round brown stool with 4 legs in light brown");

    }

}
