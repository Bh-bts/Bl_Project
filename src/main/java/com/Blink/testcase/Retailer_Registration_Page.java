package com.Blink.testcase;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.Blink.Obj.Retailer_Registration_Obj;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Page extends Retailer_Registration_Obj {

	public void CompanyDetailsPage() throws AWTException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Verify the title of the URL
		String Actual_title = driver.getTitle();
		String Expected_title = "Blink | My Yii Application";

		if (Actual_title.equals(Expected_title)) {
			System.out.println(Actual_title + "Page is matched");
		} else {
			System.out.println("Page is not matched");
		}

		// Verify the title after click on Retailer Registration Page

		String Actual_title1 = driver.getTitle();
		String Expected_title1 = "Blink | Retailer Registration";

		if (Actual_title1.equals(Expected_title1)) {
			System.out.println(Actual_title1 + "Page is matched");
		} else {
			System.out.println("Page is not matched.");
		}

		String color = CompanyDetailsbox.getCssValue("color");
		String backcolor = CompanyDetailsbox.getCssValue("background-color");

		if (!color.equals(backcolor)) {
			System.out.println("Company Details is highlighted!");
		} else {
			System.out.println("Company Details is not highlighted!");
		}

		try {
			
			driver.navigate().refresh();
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
			String year = "2023";
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

}