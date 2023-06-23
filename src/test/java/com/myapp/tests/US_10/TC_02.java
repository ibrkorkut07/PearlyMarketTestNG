package com.myapp.tests.US_10;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class TC_02 {


//    1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_Verify that a password level chart is displayed under password field
//7_Enter a password that meets the minimum required characters but does not meet the requirements for a strong password (e.g., lowercase letters only)
//8_Verify that the password level chart indicates the password as "weak."


    @Test
    public void US10_TC02 (){

        // 1_Go to https://pearlymarket.com/

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));

        PearlyMarketHomePage pearlyMarketHomePage = new PearlyMarketHomePage();
        PearlyMarketRegisterPage pearlyMarketRegisterPage = new PearlyMarketRegisterPage();
        PearlyMarketVendorRegisterPage pearlyMarketVendorRegisterPage = new PearlyMarketVendorRegisterPage();

        //2_ Navigate to registration page

        pearlyMarketHomePage.homepageRegisterButton.click();


        //3_Verify that Sign Up button clicked

        ReusableMethods.verifyElementClickable(pearlyMarketRegisterPage.signUpLink);

        //4_On the Register screen, locate the "Become a Vendor" link.
        //5_Click on "Become a Vendor" link

        pearlyMarketRegisterPage.becomeAVendorLink.click();

       //6_Verify that a password level chart is displayed under password field

        pearlyMarketVendorRegisterPage.levelChart.isDisplayed();

        //7_Enter a password that meets the minimum required characters but does not meet the requirements for a strong password (e.g., lowercase letters only)

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys("passwordabc");

        //8_Verify that the password level chart indicates the password as "weak."

        pearlyMarketVendorRegisterPage.weakText.isDisplayed();

    }
}







