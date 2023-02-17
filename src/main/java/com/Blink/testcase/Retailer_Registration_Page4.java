package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Blink.Obj.Retailer_Registration_Obj4;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Page4 extends Retailer_Registration_Obj4 {

	public void OtherDetailsPage() {

		String color = OtherDetailsbox.getCssValue("color");
		String backcolor = OtherDetailsbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Other Details is highlighted");
		} else {
			System.out.println("Other Details is not highlighted");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(10000);

			// Bank Account Details
			js.executeScript("arguments[0].scrollIntoView();", Bank_Name);
			Faker faker = new Faker();
			String bank = faker.company().name();
			Bank_Name.sendKeys(bank);

			String accName = faker.name().fullName();
			Account_Name.sendKeys(accName);

			String bsb = faker.number().digits(3);
			BSB.sendKeys(bsb);

			String accNum = faker.number().digits(15);
			Account_Num.sendKeys(accNum);

			// Business Insurance Documents
			String projectpath = System.getProperty("user.dir");
			Public_Liab.sendKeys(projectpath + "\\SampleData\\flower.jpg");
			Prof_Ind.sendKeys(projectpath + "\\SampleData\\sample_pdf.pdf");
			Work_Ins.sendKeys(projectpath + "\\SampleData\\Sample-PNG-Image.png");
			Add_Attch.sendKeys(projectpath + "\\SampleData\\flower.jpg");

			js.executeScript("arguments[0].scrollIntoView();", submit);
			js.executeScript("arguments[0].style.border='2px solid red'", submit);
			submit.click();

			Thread.sleep(12000);
			String actual = submit_mess.getText();
			String Expected = "Your form has been submitted successfully.You'll be receiving the credentials in the next 24 hours via email.";
			if (actual.equals(Expected)) {
				System.out.println("Successfully submitted form");
			} else {
				System.out.println("Receiving error");
			}

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

}
