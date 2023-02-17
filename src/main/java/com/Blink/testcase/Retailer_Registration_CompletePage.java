package com.Blink.testcase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.Blink.Obj.Retailer_Registration_Complete_Obj;
import com.github.javafaker.Faker;

public class Retailer_Registration_CompletePage extends Retailer_Registration_Complete_Obj {

	public void FirstPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Verify the title of the URL
		String Actual_title = driver.getTitle();
		String Expected_title = "Blink | My Yii Application";

		if (Actual_title.equals(Expected_title)) {
			System.out.println(Actual_title + "Page is matched");
		} else {
			System.out.println("Page is not matched");
		}

		try {
			w.until(ExpectedConditions.visibilityOf(RegisterNow_button)); 
			js.executeScript("arguments[0].style.border='2px solid red'", RegisterNow_button);
			RegisterNow_button.click();
			w.until(ExpectedConditions.visibilityOf(RetailerRegistration_button));
			js.executeScript("arguments[0].style.border='2px solid red'", RetailerRegistration_button);
			RetailerRegistration_button.click();

		} catch (NoSuchElementException e1) {
			e1.printStackTrace();

		}

		String color = CompanyDetailsbox.getCssValue("color");
		String backcolor = CompanyDetailsbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Company Details is highlighted!");
		} else {
			System.out.println("Company Details is not highlighted!");
		}

		try {

			// Company Details
			Faker faker = new Faker();
			String cmpname = faker.company().name();
			CompanyName_Field.sendKeys(cmpname);
			String abn = faker.number().digits(5);
			ABN_Field.sendKeys(abn);
			String projectPath = System.getProperty("user.dir");
			Company_Logo.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			CEC_Accreditation.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");

			CalendarExpiry_Date.click();
			String year = "2024";
			String month = "October";
			String date = "22";

			while (true) {
				String monthyearval = MonthYearVal.getText();
				String month1 = monthyearval.split(" ")[0].trim();
				String year1 = monthyearval.split(" ")[1].trim();

				if (month1.equalsIgnoreCase(month) && year1.equals(year)) {
					break;
				} else {
					js.executeScript("arguments[0].style.border='2px solid red'", Next_button);
					Next_button.click();
				}
			}

			for (WebElement ele : alldates) {
				String dt = ele.getText();

				if (dt.equals(date)) {
					ele.click();
					break;
				}
			}
			rebate_checkbox.click();

			// Company Registered Address
			Registered_Address1.sendKeys("fa");
			Thread.sleep(3000);
			Actions builder = new Actions(driver);
			builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			Registered_Address1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			String address2 = faker.address().fullAddress();
			Registered_Address2.sendKeys(address2);

			/*
			 * String subrb = faker.address().city(); Suburb.sendKeys(subrb);
			 * 
			 * String state = faker.address().state(); State.sendKeys(state);
			 * 
			 * String post = faker.number().digits(5); postcode.sendKeys(post);
			 */

			// Company Office Address
			Office_Address1.sendKeys("qa");
			Thread.sleep(3000);
			builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			Office_Address1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			String offi_address2 = faker.address().fullAddress();
			Office_Address2.sendKeys(offi_address2);

			/*
			 * Suburb1.sendKeys(subrb); State1.sendKeys(state); postcode1.sendKeys(post);
			 */

			// Primary Contact Details
			String pos = faker.job().position();
			Position.sendKeys(pos);

			Select select = new Select(Title);
			select.selectByValue("Mr.");

			String fname = faker.name().firstName();
			FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			LastName.sendKeys(lname);

			String domain = "@gmail.com";

			String email = fname.toLowerCase() + "." + lname.toLowerCase() + domain;
			Email_ID.sendKeys(email);

			PasswordGenerator gen = new PasswordGenerator();
			CharacterData lowercasedata = EnglishCharacterData.LowerCase;
			CharacterRule lowercaserule = new CharacterRule(lowercasedata);
			lowercaserule.setNumberOfCharacters(4);

			CharacterData uppercasedata = EnglishCharacterData.UpperCase;
			CharacterRule uppercaserule = new CharacterRule(uppercasedata);
			uppercaserule.setNumberOfCharacters(1);

			CharacterData digitsdata = EnglishCharacterData.Digit;
			CharacterRule digitsrule = new CharacterRule(digitsdata);
			digitsrule.setNumberOfCharacters(2);

			CharacterData speChardata = new CharacterData() {

				@Override
				public String getErrorCode() {
					return "ERROR_CODE";
				}

				@Override
				public String getCharacters() {
					return "!@#$%^&*;:";
				}
			};

			CharacterRule speCharrule = new CharacterRule(speChardata);

			String password = gen.generatePassword(8, uppercaserule, lowercaserule, speCharrule, digitsrule);
			Password.sendKeys(password);
			Conf_Password.sendKeys(password);

			String contact = faker.number().digits(9);
			Contact_Number.sendKeys(contact);

			DOB_Calendar.click();
			String DOB_year = "2020";
			String DOB_month = "June";
			String DOB_date = "15";

			while (true) {
				String DOB_monthyearval = DOB_MonthYearVal.getText();
				String DOB_month1 = DOB_monthyearval.split(" ")[0].trim();
				String DOB_year1 = DOB_monthyearval.split(" ")[1].trim();

				if (DOB_month1.equalsIgnoreCase(DOB_month) && DOB_year1.equals(DOB_year)) {
					break;
				} else {
					js.executeScript("arguments[0].style.border='2px solid red'", Prev_button);
					Prev_button.click();
				}
			}

			for (WebElement ele1 : DOB_alldates) {
				String DOB_dt = ele1.getText();

				if (DOB_dt.equals(DOB_date)) {
					ele1.click();
					break;
				}
			}

			String licnumber = faker.number().digits(12);
			Licence_Number.sendKeys(licnumber);

			String emgName = faker.name().fullName();
			Emergency_Name.sendKeys(emgName);

			String emgCnt = faker.number().digits(9);
			Emergency_Contact.sendKeys(emgCnt);

			Profile_Pic.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Driver_Lic.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");
			Police_Check.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Working_Vul.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Working_with_child.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Thread.sleep(2000);

			// Click on Next
			js.executeScript("arguments[0].scrollIntoView();", Next_Page);
			js.executeScript("arguments[0].style.border='2px solid red'", Next_Page);
			Next_Page.click();
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void SecondPage() {

		String color = ServiceOfferingbox.getCssValue("color");
		String backcolor = ServiceOfferingbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Service Offering is higlighted");
		} else {
			System.out.println("Service Offering is not highlighted");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		try {
			w.until(ExpectedConditions.visibilityOf(All_Services));

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
			//SA.click();
			w.until(ExpectedConditions.visibilityOf(VIC));
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

	public void ThirdPage() {

		String color = ContactDetailsbox.getCssValue("color");
		String backcolor = ContactDetailsbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Contact Details is highlighted");
		} else {
			System.out.println("Contact Details is not highlighted");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		try {

			// Operational Contact Details
			js.executeScript("window.scrollBy(0,-250)");
			w.until(ExpectedConditions.visibilityOf(Cont_Position));
			Faker faker = new Faker();
			String pos = faker.job().position();
			Cont_Position.sendKeys(pos);

			String fname = faker.name().firstName();
			Cont_FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			Cont_LastName.sendKeys(lname);

			String domainName = "@gmail.com";
			String email = fname.toLowerCase() + "." + lname.toLowerCase() + domainName;
			Email.sendKeys(email);

			String contNum = faker.number().digits(10);
			ContactNumber.sendKeys(contNum);

			String licnumber = faker.number().digits(12);
			Driv_Lic_No.sendKeys(licnumber);

			String projectpath = System.getProperty("user.dir");
			Cont_Driver_Lic.sendKeys(projectpath + "\\SampleData\\flower.jpg");
			Cont_Police_Check.sendKeys(projectpath + "\\SampleData\\sample_pdf.pdf");
			Work_Vul.sendKeys(projectpath + "\\SampleData\\Sample-PNG-Image.png");
			Work_Child.sendKeys(projectpath + "\\SampleData\\flower.jpg");

			// Billing Contact Details

			CheckBox.click();
			String billPos = faker.job().position();
			Bill_Position.sendKeys(billPos);

			String billfname = faker.name().firstName();
			Bill_FirstName.sendKeys(billfname);

			String billlname = faker.name().lastName();
			Bill_LastName.sendKeys(billlname);

			String billemail = billfname.toLowerCase() + billlname.toLowerCase() + "." + domainName;
			Bill_Email.sendKeys(billemail);

			String billcontNum = faker.number().digits(9);
			Bill_ContNum.sendKeys(billcontNum);

			String billLicnumber = faker.number().digits(12);
			Bill_Driv_Lic_No.sendKeys(billLicnumber);

			Thread.sleep(2000);
			Bill_Driver_Lic.sendKeys(projectpath + "\\SampleData\\Sample-PNG-Image.png");
			Bill_Police_Check.sendKeys(projectpath + "\\SampleData\\sample_pdf.pdf");

			// Click on Next
			js.executeScript("arguments[0].scrollIntoView();", Next_Page2);
			js.executeScript("arguments[0].style.border='2px solid red'", Next_Page2);
			Next_Page2.click();

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

	public void ForthPage() {

		String color = OtherDetailsbox.getCssValue("color");
		String backcolor = OtherDetailsbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Other Details is highlighted");
		} else {
			System.out.println("Other Details is not highlighted");
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			
			w.until(ExpectedConditions.visibilityOf(Bank_Name));

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
			js.executeScript("arguments[0].style.border='2px solid red'", mess_box);
			String actual = submit_mess.getText();
			String Expected = "Your form has been submitted successfully.You'll be receiving the credentials in the next 24 hours via email.";
			if (actual.equals(Expected)) {
				System.out.println("Successfully submitted form : " + actual);
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
