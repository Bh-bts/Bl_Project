package com.Blink.MainPage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Blink.Browsers.AllBrowsers;
import com.Blink.testcase.Retailer_Registration_Page;
import com.Blink.testcase.Retailer_Registration_Page2;
import com.Blink.testcase.Retailer_Registration_Page3;
import com.Blink.testcase.Retailer_Registration_Page4;
import com.Blink.testcase.Val_Retailer_Registration_Page;
import com.Blink.testcase.Val_Retailer_Registration_Page3;
import com.Blink.testcase.Val_Retailer_Registration_Page4;
import com.Blink.utils.PropertiesClass;
import com.Blink.utils.ScreenshotCapture;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_MainPage extends Retailer_Registration_Page {

	public Retailer_Registration_MainPage() throws IOException {
		AllBrowsers.driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getUrl());
	}

	@Test(priority = 1)
	public void AllValidation_Page1() throws InterruptedException {
		Val_Retailer_Registration_Page blank28 = PageFactory.initElements(driver, Val_Retailer_Registration_Page.class);
		blank28.AllVal_CompanyDetailsPage();
	}

	@Test(priority = 2)
	public void Rest_Validation_Page1() throws InterruptedException {
		Val_Retailer_Registration_Page blank2 = PageFactory.initElements(driver, Val_Retailer_Registration_Page.class);
		blank2.RestVal_CompanyDetailsPage();
	}

	@Test(priority = 3)

	// Call the Company Details Page

	public void firstPage() throws AWTException {
		Retailer_Registration_Page Page1 = PageFactory.initElements(driver, Retailer_Registration_Page.class);
		Page1.CompanyDetailsPage();
	}

	@Test(priority = 4)

	// Call the Service Offering Page

	public void secondPage() {
		Retailer_Registration_Page2 Page2 = PageFactory.initElements(driver, Retailer_Registration_Page2.class);
		Page2.ServiceOfferingPage();
	}

	@Test(priority = 5)
	public void AllValidation_Page3() {
		Val_Retailer_Registration_Page3 blank29 = PageFactory.initElements(driver,
				Val_Retailer_Registration_Page3.class);
		blank29.AllVal_ContactDetails();
	}

	@Test(priority = 6)
	public void Rest_Validation_Page3() {
		Val_Retailer_Registration_Page3 blank30 = PageFactory.initElements(driver,
				Val_Retailer_Registration_Page3.class);
		blank30.RestVal_ContactDetails();
	}

	@Test(priority = 7)

	// Call the Contact Details Page

	public void thirdPage() {
		Retailer_Registration_Page3 Page3 = PageFactory.initElements(driver, Retailer_Registration_Page3.class);
		Page3.ContactDetailsPage();
	}

	@Test(priority = 8)

	public void AllValidation_Page4() {
		Val_Retailer_Registration_Page4 Blanke31 = PageFactory.initElements(driver,
				Val_Retailer_Registration_Page4.class);
		Blanke31.AllVal_OtherDetails();
	}

	@Test(priority = 9)

	// Call the Other Details Page

	public void forthPage() {
		Retailer_Registration_Page4 Page4 = PageFactory.initElements(driver, Retailer_Registration_Page4.class);
		Page4.OtherDetailsPage();
	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot " + result.getName());
			System.out.println("Screenshot is generated" + '\n');

		}

	}

}
