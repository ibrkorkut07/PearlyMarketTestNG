package com.myapp.tests.US_18;



import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.myapp.pages.Manage_CouponPage;
import com.myapp.pages.PearlyMarketHomePage;
import com.myapp.utilities.*;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import com.myapp.utilities.JSUtils;

import io.netty.util.internal.ThreadLocalRandom;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Long.parseLong;

public class UserShouldBeCreateCoupons {
    @Test

    public void createCoupon() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_homepage_url"));

        PearlyMarketHomePage homePage=new PearlyMarketHomePage();
        Manage_CouponPage manageCouponPage=new Manage_CouponPage();
        ReusableMethods reusableMethods=new ReusableMethods();
        Faker faker=new Faker();
        reusableMethods.signIn();
//        1_Go to https://pearlymarket.com/

//        2_User should navigate to Store Manager
        reusableMethods.scrollPageEndActions();
        homePage.myAccountButton.click();
        homePage.storeManagerButton.click();

        JSUtils.clickWithTimeoutByJS(homePage.couponsButton);

        manageCouponPage.addCouponButton.click();
        manageCouponPage.couponCode.sendKeys(faker.bothify("??????##").toUpperCase());
        manageCouponPage.couponDescription.sendKeys(faker.lorem().paragraph());
        reusableMethods.getDropdownSelectedOptions(manageCouponPage.discountType);
        manageCouponPage.couponAmount.sendKeys(faker.bothify("##"));
        JSUtils.clickWithTimeoutByJS(manageCouponPage.expiryDate);
        JSUtils.clickWithTimeoutByJS(manageCouponPage.submitButton);





    }
}