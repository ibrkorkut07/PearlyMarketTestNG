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

public class TC_09 {

    public ExcelUtils excelUtils;

//    1_Go to https://pearlymarket.com/
//            2_ Navigate to registration page
//3_Click on Sign Up button
//4_On the Register screen, locate the "Become a Vendor" link.
//5_Click on "Become a Vendor" link
//6_Enter a password that contains uppercase letters, lowercase letters, and digits, but no special character
//7_ Proceed with the registration process
//8_Verify that an error message is displayed, indicating that the password must contain at least one special character.
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


    //5_ Leave the e-mail text area empty
    pearlyMarketVendorRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("vendorregistermail"));

//6_Enter a password that contains uppercase letters, lowercase letters, and digits, but no special character

    pearlyMarketVendorRegisterPage.passwordBox.sendKeys("PASSWORD!");
    pearlyMarketVendorRegisterPage.confirmPasswordBox.sendKeys("PASSWORD!");

    WaitUtils.waitFor(2);
    //7_Click on register button
    JSUtils.clickWithTimeoutByJS(pearlyMarketVendorRegisterPage.registerButton);

//8_Verify that an error message is displayed, indicating that the password must contain at least one special character.
    // We can directly registered with no speacial character password.

    MediaUtils.takeScreenshotOfTheEntirePageAsString();

}
}

