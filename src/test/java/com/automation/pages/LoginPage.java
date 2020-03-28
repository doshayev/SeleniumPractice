package com.automation.pages;

import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement login;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPassword;

    public LoginPage(){
        // to connect our webdriver, page class and page factory
        // PageFactory - used to use @FindBy annotations
        // PageFactory - helps to find elements easier
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*Method to login
    Login as specific user
    usernameValue
    passwordValue
    */
    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue, Keys.ENTER);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
    /*Method to login, version #2
    * Credential will be retrieved from configuration.properties file
    */
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
    }

}
