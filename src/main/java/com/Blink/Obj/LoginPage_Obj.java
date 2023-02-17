package com.Blink.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.Browsers.AllBrowsers;

/**
 * @author Bhavin.Thumar
 *
 */

public class LoginPage_Obj extends AllBrowsers {

	public @FindBy(xpath = "//div/input[@type='text']") WebElement Email;
	public @FindBy(xpath = "//div/input[@type='password']") WebElement Password;
	public @FindBy(xpath = "//div/button[@type='submit']") WebElement Login_button;

	public @FindBy(xpath = "//div[@class='user']") WebElement Profile_button;
	public @FindBy(xpath = "//a[@href='/site/logout']") WebElement Logout_button;
	public @FindBy(xpath = "//div[@class='form-group field-email required']/div") WebElement emailMessage;
	public @FindBy(xpath = "//div[@class='form-group field-password required']/div") WebElement passwordMessage;
	

}
