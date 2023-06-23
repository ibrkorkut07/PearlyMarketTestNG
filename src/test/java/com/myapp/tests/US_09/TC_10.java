package com.myapp.tests.US_09;

import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.pages.PearlyMarketMyAccountPage;
import com.myapp.pages.PearlyMarketRegisterPage;
import com.myapp.pages.PearlyMarketVendorRegisterPage;
import com.myapp.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_10 {
    public ExcelUtils excelUtils;

//    1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_ Enter a valid password
//7_ Enter a invalid confirmation password(e.g. miss some letters)
//8_Proceed with the registration process
//9_"Password and Confirm-password are not same." message should be visible


    @Test
    public void US09_TC09 () throws IOException {

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


        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

        pearlyMarketVendorRegisterPage.verifCodeBox.click();


        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("gmail_login"));
        Driver.getDriver().findElement(By.xpath("//*[@name='identifier']")).sendKeys("stevegregor2023@gmail.com");

        Driver.getDriver().findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]")).sendKeys(excelUtils.getCellData(2,2));
        Driver.getDriver().findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();


        WaitUtils.waitForVisibility(By.xpath("//div//span[@email='info@pearlymarket.com']"),4).click();

        String verificationCode=Driver.getDriver().findElement(By.xpath("//div/p/b")).getText();

        ReusableMethods.switchToWindow(0);

        pearlyMarketVendorRegisterPage.verifCodeBox.sendKeys(verificationCode);

        MediaUtils.takeScreenshotOfTheEntirePageAsString();


        //5_ Enter e-mail
        pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

        //6_ Enter a valid password

        pearlyMarketVendorRegisterPage.passwordBox.sendKeys("Password123!");


        //7_ Enter a invalid confirmation password(e.g. miss some letters)

        pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys("Pass123!");

        WaitUtils.waitFor(2);
     //8_Proceed with the registration process
        JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);
        WaitUtils.waitFor(2);

       //9_"Password and Confirm-password are not same." message should be visible

        pearlyMarketVendorRegisterPage.unmatchedPassword.isDisplayed();
    }
}



