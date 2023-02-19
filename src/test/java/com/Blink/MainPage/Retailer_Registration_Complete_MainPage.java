package com.Blink.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Blink.Browsers.AllBrowsers;
import com.Blink.testcase.Retailer_Registration_CompletePage;
import com.Blink.utils.PropertiesClass;
import com.Blink.utils.ScreenshotCapture;

public class Retailer_Registration_Complete_MainPage extends Retailer_Registration_CompletePage {

	public Retailer_Registration_Complete_MainPage() throws IOException {
		AllBrowsers.driver = AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getStageUrl());
	}

	@Test(priority = 1)
	public void firstpage() {

		Retailer_Registration_CompletePage blank1 = PageFactory.initElements(driver,
				Retailer_Registration_CompletePage.class);
		blank1.FirstPage();

	}

	@Test(priority = 2)

	public void secondpage() {

		Retailer_Registration_CompletePage blank2 = PageFactory.initElements(driver,
				Retailer_Registration_CompletePage.class);
		blank2.SecondPage();

	}

	@Test(priority = 3)

	public void thirdpage() {

		Retailer_Registration_CompletePage blank3 = PageFactory.initElements(driver,
				Retailer_Registration_CompletePage.class);
		blank3.ThirdPage();

	}

	@Test(priority = 4)

	public void forthpage() {

		Retailer_Registration_CompletePage blank4 = PageFactory.initElements(driver,
				Retailer_Registration_CompletePage.class);
		blank4.ForthPage();

	}

	@AfterMethod(alwaysRun = true)

	public void tearDown(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			ScreenshotCapture.captureScreenshot(driver, "Screenshot " + result.getName());
			System.out.println("Screenshot is generated" + '\n');

		}

	}

}
