package com.Blink.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Blink.Browsers.AllBrowsers;
import com.Blink.testcase.Login_Page;
import com.Blink.utils.PropertiesClass;

/**
 * @author Bhavin.Thumar
 *
 */

public class Login_MainPage extends Login_Page {

	public Login_MainPage() throws IOException {
		driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getAdminUrl());
	}

	@Test(priority = 1)
	public void loginPage1() throws InterruptedException, IOException {

		Login_Page EnterInValidPass = PageFactory.initElements(driver, Login_Page.class);
		EnterInValidPass.InvalidPass(PropertiesClass.getUserId(), PropertiesClass.getInvalidPassword());

	}

	@Test(priority = 2)

	public void loginPage2() throws InterruptedException, IOException {

		Login_Page EnterInvalidID = PageFactory.initElements(driver, Login_Page.class);
		EnterInvalidID.InvalidId(PropertiesClass.getInvalidId(), PropertiesClass.getPassword());

	}

	@Test(priority = 3)

	public void loginPage3() throws InterruptedException, IOException {
		
		Login_Page EnterInvalidID_Pass = PageFactory.initElements(driver, Login_Page.class);
		EnterInvalidID_Pass.InvalidId_Pass(PropertiesClass.getInvalidId(), PropertiesClass.getInvalidPassword());

	}

	@Test(priority = 4)

	public void loginPage4() throws InterruptedException, IOException {

		Login_Page EnterValidId_Pass = PageFactory.initElements(driver, Login_Page.class);
		EnterValidId_Pass.ValidId_Pass(PropertiesClass.getUserId(), PropertiesClass.getPassword());

	}

}
