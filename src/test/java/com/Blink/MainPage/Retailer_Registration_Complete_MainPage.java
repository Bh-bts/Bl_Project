package com.Blink.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Blink.Browsers.AllBrowsers;
import com.Blink.testcase.Retailer_Registration_CompletePage;
import com.Blink.utils.PropertiesClass;

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

}
