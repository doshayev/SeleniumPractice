package com.automation.pages;

import com.automation.tests.vytrack.TestBase;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginTests extends TestBase {
        @Test
    public void verifyPageTitle(){
            LoginPage loginPage = new LoginPage();
            loginPage.login();
            Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");
        }

}
