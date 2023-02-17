package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Blink.Obj.Retailer_Registration_Obj2;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Page2 extends Retailer_Registration_Obj2 {

	public void ServiceOfferingPage() {

		String color = ServiceOfferingbox.getCssValue("color");
		String backcolor = ServiceOfferingbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Service Offering is higlighted");
		} else {
			System.out.println("Service Offering is not highlighted");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(10000);

			// All Services
			js.executeScript("arguments[0].scrollIntoView();", All_Services);
			Faker faker = new Faker();
			String allservice = faker.backToTheFuture().quote();
			All_Services.sendKeys(allservice);

			// Selected Services
			String selService = faker.gameOfThrones().quote();
			Selected_Services.sendKeys(selService);

			// Region Service
			All_Regions.sendKeys("ade");
			Reg_opt1.click();
			Reg_opt2.click();

			Thread.sleep(2000);
			All_Regions.clear();
			All_Regions.sendKeys("melbourne");

			Thread.sleep(2000);
			Reg_opt3.click();
			Reg_opt4.click();

			// Selected Regions
			Selected_Regions.sendKeys("ade");
			Thread.sleep(1000);
			String region = Region_list.getText();
			System.out.println("After enter the word in search field : " + region);

			// Delete the all regions in Selected Regions field
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();", SA);
			SA.click();
			js.executeScript("arguments[0].scrollIntoView();", VIC);
			VIC.click();

			// Click on Next
			js.executeScript("arguments[0].scrollIntoView();", Next_Page1);
			js.executeScript("arguments[0].style.border='2px solid red'", Next_Page1);
			Next_Page1.click();

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}

	}

}
