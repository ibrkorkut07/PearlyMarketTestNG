package com.myapp.tests.US_16;

import com.myapp.pages.PearlyMarketAddProductPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.utilities.Driver;
import com.myapp.utilities.MediaUtils;
import com.myapp.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_05 {

    ReusableMethods reusableMethods = new ReusableMethods();
    MediaUtils takeScreenShot = new MediaUtils();
    PearlyMarketHomePage pmHomePage = new PearlyMarketHomePage();

    PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();

    PearlyMarketAddProductPage pearlyMarketAddProductPage = new PearlyMarketAddProductPage();
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();


    @Test
    public void addSimpleProductAsAVendor() throws IOException {

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
//        5_User should be able to select categories
        // reMethods.scrollIntoView(pmAddProductPage.featuredImageBox);
        executor.executeScript("arguments[0].click();", pearlyMarketAddProductPage.galaryImageBox);
        // pearlyMarketAddProductPage.addToGalarySelectFileButton.click();
        String image1_FilePath= System.getProperty("user.home") + "C:Masaüstü/flower.jpeg/";
        pearlyMarketAddProductPage.addToGalarySelectFileButton.sendKeys(image1_FilePath);
        pearlyMarketAddProductPage.mediaLibrarySection.click();
        pearlyMarketAddProductPage.addToGalaryStoolImage.click();
        pearlyMarketAddProductPage.addToGalaryButton.click();

        pearlyMarketAddProductPage.featuredImageBox.click();
        pearlyMarketAddProductPage.chooseImageStoolImage.click();
        pearlyMarketAddProductPage.chooseImageSelectButton.click();

//       pearlyMarketAddProductPage.kitchenButton.click();

        takeScreenShot.takeScreenshotOfTheEntirePage();


    }
}