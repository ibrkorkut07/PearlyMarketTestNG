package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import com.myapp.utilities.WaitUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_05 {

//
//1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_ Enter an INVALID email(e.g., missing '@' symbol)
//7_ "Please provide a valid email address." message should be visible

    @Test
    public void US09_TC05 () throws IOException {

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


        //5_ Enter a valid email address in the email address field

        WaitUtils.waitFor(1);

        pearlyMarketVendorRegisterPage.emailBox.sendKeys("steve.gmail.com");
        // 6_ Click on password box

        pearlyMarketVendorRegisterPage.passwordBox.click();

        WaitUtils.waitFor(2);

        //7_ "Please provide a valid email address." message should be visible

      //  pearlyMarketVendorRegisterPage.invalidEmailText.isDisplayed();

        ReusableMethods.verifyElementDisplayed(pearlyMarketVendorRegisterPage.invalidEmailText);

    }
}
