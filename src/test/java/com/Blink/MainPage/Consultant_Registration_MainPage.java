package com.Blink.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Blink.Browsers.AllBrowsers;
import com.Blink.testcase.Val_Consultant_Registration_Page;
import com.Blink.utils.PropertiesClass;
import com.Blink.utils.ScreenshotCapture;

public class Consultant_Registration_MainPage extends Val_Consultant_Registration_Page {

	public Consultant_Registration_MainPage() throws IOException {
		AllBrowsers.driver = startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getUrl());
	}

	@Test(priority = 1)
	public void AllValidation_Page() {

		Val_Consultant_Registration_Page blank1 = PageFactory.initElements(driver,
				Val_Consultant_Registration_Page.class);
		blank1.AllVal_ConsultantRegistrationPage();

	}

	@Test(priority = 2)
	public void Rest_Validation_Page() {

		Val_Consultant_Registration_Page blank2 = PageFactory.initElements(driver,
				Val_Consultant_Registration_Page.class);
		blank2.RestVal_ConsultantRegistrationPage();

	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot " + result.getName());
			System.out.println("Screenshot is generated" + '\n');

		}

	}

}
