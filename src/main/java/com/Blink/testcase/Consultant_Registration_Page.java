package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.Blink.Obj.Consultant_Registration_Obj;
import com.github.javafaker.Faker;

public class Consultant_Registration_Page extends Consultant_Registration_Obj {

	public void ConsultantRegistrationPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			driver.navigate().refresh();
			String Actual_title = driver.getTitle();
			String Expected_title = "Blink | Consultant Registration";

			if (Actual_title.equals(Expected_title)) {
				System.out.println(Actual_title + "Page is matched");

			} else {
				System.out.println("Page is not matched!");
			}

			Faker faker = new Faker();
			RefCode.sendKeys("LlAK_lJJKq");
			Select select = new Select(Title);
			select.selectByValue("Mr.");

			String fname = faker.name().firstName();
			FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			LastName.sendKeys(lname);

			String domain_name = "@google.com";
			String email = fname.toLowerCase() + "." + lname.toLowerCase() + domain_name;
			Email.sendKeys(email);

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

			js.executeScript("arguments[0].scrollIntoView(true);", Profile_Pic);
			String projectPath = System.getProperty("user.dir");
			Profile_Pic.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Driver_Lic.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");
			Police_Check.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Working_Vul.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Working_with_child.sendKeys(projectPath + "\\SampleData\\flower.jpg");

			Thread.sleep(2000);
			submit.click();
			Thread.sleep(10000);

			String actual = submit_mess.getText();
			String Expected = "Your form has been submitted successfully.You'll be receiving the credentials in the next 24 hours via email.";

			if (actual.equals(Expected)) {
				System.out.println("Successfully submitted form");
			} else {
				System.out.println("Receiving error");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());

		}

	}

}
