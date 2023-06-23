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
4. Click on galary image box on the upper- right under featured image box
5. Click on "SELECT FILES" box on "Add to Galary" window, select an image & click on "ADD TO GALARY" on the right-bottom corner
6. Click on featured image box on the upper- right above galary image box
7. Click on "Media Library" section on"Choose Image" window
8. Select an image & click on "SELECT" box on the right-bottom corner
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
        // reMethods.scrollIntoView(pmAddProductPage.featuredImageBox);
        executor.executeScript("arguments[0].click();", pmAddProductPage.galaryImageBox);
        // pmAddProductPage.addToGalarySelectFileButton.click();
        String image1_FilePath= System.getProperty("user.home") + "\\OneDrive\\Desktop\\deneme\\Stool.PNG";
        pmAddProductPage.addToGalarySelectFileButton.sendKeys(image1_FilePath);
        pmAddProductPage.mediaLibrarySection.click();
        pmAddProductPage.addToGalaryStoolImage.click();
        pmAddProductPage.addToGalaryButton.click();

        pmAddProductPage.featuredImageBox.click();
        pmAddProductPage.chooseImageStoolImage.click();
        pmAddProductPage.chooseImageSelectButton.click();

    }

}
