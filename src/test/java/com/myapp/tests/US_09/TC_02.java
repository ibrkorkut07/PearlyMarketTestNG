package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.*;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_02 {

    @Test
    public void US09_TC02 () throws IOException {

        // 1_Go to https://pearlymarket.com/

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));

        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketRegisterPage pearlyMarketRegisterPage = new PearlyMarketRegisterPage();
        PearlyMarketVendorRegisterPage pearlyMarketVendorRegisterPage = new PearlyMarketVendorRegisterPage();
        PearlyMarketMyAccountPage pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage();


        //2_ Navigate to registration page

        pearlyMarketHomePage.homepageRegisterButton.click();


        //3_Verify that Sign Up button clicked

        ReusableMethods.verifyElementClickable(pearlyMarketRegisterPage.signUpLink);

        //4_On the Register screen, locate the "Become a Vendor" link and click on

        pearlyMarketRegisterPage.becomeAVendorLink.click();

        //5_ Leave the e-mail text area empty
        pearlyMarketVendorRegisterPage.emailBox.sendKeys("");

        //6_ Provide a valid password and confirm password

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));
        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty("vendorregisterpass"));

        WaitUtils.waitFor(2);
        //7_Click on register button
        JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);

        //8_"Email: This field is required." message should be visible
        pearlyMarketVendorRegisterPage.emailRequiredText.isDisplayed();

    }
}