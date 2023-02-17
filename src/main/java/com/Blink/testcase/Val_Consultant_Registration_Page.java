package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.Blink.Obj.Consultant_Registration_Obj;
import com.github.javafaker.Faker;

public class Val_Consultant_Registration_Page extends Consultant_Registration_Obj {

	public void AllVal_ConsultantRegistrationPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='2px solid red'", RegisterNow_button);
			RegisterNow_button.click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='2px solid red'", ConsultantRegistration_button);
			ConsultantRegistration_button.click();
		} catch (NoSuchElementException e1) {
			e1.printStackTrace();

		} catch (StaleElementReferenceException e2) {
			e2.printStackTrace();

		} catch (InterruptedException e3) {
			e3.printStackTrace();

		}

		try {

			js.executeScript("arguments[0].scrollIntoView(true);", submit);
			js.executeScript("arguments[0].style.border='2px solid red'", submit);
			submit.click();

			Thread.sleep(4000);
			System.out.println(
					"All validation of Consultant Registration ---------------------------------------------------------------------------------------------------- ");

			js.executeScript("arguments[0].scrollIntoView(true);", validation1);
			js.executeScript("arguments[0].style.border='2px solid red'", validation1);
			String error1 = validation1.getText();
			System.out.println("Validation is fired when user not uploading the Police Check attachment : " + error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation2);
			String error2 = validation2.getText();
			System.out
					.println("Validation is fired when user not uploading the Driver's License attachment : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation3);
			String error3 = validation3.getText();
			System.out
					.println("Validation is fired when user not uploading the Profile Picture attachment : " + error3);
			;

			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error4 = validation4.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Emergency Contact Number field : " + error4);

			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error5 = validation5.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Emergency Contact Name field : " + error5);

			js.executeScript("arguments[0].style.border='2px solid red'", validation6);
			String error6 = validation6.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Driver's Licence Number field : " + error6);

			js.executeScript("arguments[0].style.border='2px solid red'", validation7);
			String error7 = validation7.getText();
			System.out.println("Validation is fired when user fill up any content in Date of Birth field : " + error7);

			js.executeScript("arguments[0].style.border='2px solid red'", validation8);
			String error8 = validation8.getText();
			System.out.println("Validation is fired when user fill up any content in Contact Number field : " + error8);

			js.executeScript("arguments[0].style.border='2px solid red'", validation9);
			String error9 = validation9.getText();
			System.out
					.println("Validation is fired when user fill up any content in Confirm Password field : " + error9);

			js.executeScript("arguments[0].style.border='2px solid red'", validation10);
			String error10 = validation10.getText();
			System.out.println("Validation is fired when user fill up any content in Password field : " + error10);

			js.executeScript("arguments[0].style.border='2px solid red'", validation11);
			String error11 = validation11.getText();
			System.out.println("Validation is fired when user fill up any content in Email field : " + error11);

			js.executeScript("arguments[0].style.border='2px solid red'", validation12);
			String error12 = validation12.getText();
			System.out.println("Validation is fired when user fill up any content in Last Name field : " + error12);

			js.executeScript("arguments[0].style.border='2px solid red'", validation13);
			String error13 = validation13.getText();
			System.out.println("Validation is fired when user fill up any content in First Name field : " + error13);

			js.executeScript("arguments[0].style.border='2px solid red'", validation14);
			String error14 = validation14.getText();
			System.out.println("Validation is fired when user fill up any content in Title field : " + error14);

			js.executeScript("arguments[0].style.border='2px solid red'", validation15);
			String error15 = validation15.getText();
			System.out.println("Validation is fired when user fill up any content in Referral Code field : " + error15);
			js.executeScript("arguments[0].scrollIntoView(true);", validation15);

		} catch (NoSuchElementException e4) {
			e4.printStackTrace();

		} catch (StaleElementReferenceException e5) {
			e5.printStackTrace();

		} catch (InterruptedException e6) {
			e6.getMessage();
		}

	}

	public void RestVal_ConsultantRegistrationPage() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(2000);
			driver.navigate().refresh();
			System.out.println(
					"Rest of validation of Page1 is ---------------------------------------------------------------------------------------------------- ");
			Faker faker = new Faker();
			RefCode.sendKeys("LlAK_lJJKq");
			Select select = new Select(Title);
			select.selectByValue("Mr.");

			String fname = faker.name().firstName();
			FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			LastName.sendKeys(lname);

			String email = fname.toLowerCase() + "." + lname.toLowerCase();
			Email.sendKeys(email);

			PasswordGenerator gen = new PasswordGenerator();
			CharacterData lowercasedata = EnglishCharacterData.LowerCase;
			CharacterRule lowercaserule = new CharacterRule(lowercasedata);
			lowercaserule.setNumberOfCharacters(1);

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

			@SuppressWarnings("unused")
			String password = gen.generatePassword(5, uppercaserule, lowercaserule, speCharrule, digitsrule);
			String pass = faker.number().digits(3);
			Password.sendKeys(pass);
			String Confpass = faker.number().digits(4);
			Conf_Password.sendKeys(Confpass);

			String contact = faker.number().digits(2);
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

			String emgCnt = faker.number().digits(1);
			Emergency_Contact.sendKeys(emgCnt);

			String projectPath = System.getProperty("user.dir");
			Profile_Pic.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Driver_Lic.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");
			Police_Check.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Working_Vul.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Working_with_child.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Thread.sleep(2000);

			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error1 = validation4.getText();
			System.out
					.println("Validation is fired when user enter the less than 9 digits in Emergency Contact Number : "
							+ error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation8);
			String error2 = validation8.getText();
			System.out.println(
					"Validation is fired when user enter the less than 9 digits in contact number : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation9);
			String error3 = validation9.getText();
			System.out.println(
					"Validation is fired when user enter the less than 8 digits in Confirm password field : " + error3);

			js.executeScript("arguments[0].style.border='2px solid red'", validation10);
			String error4 = validation10.getText();
			System.out.println(
					"Validation is fired when user enter the less than 8 digits in password field : " + error4);

			js.executeScript("arguments[0].style.border='2px solid red'", validation11);
			String error5 = validation11.getText();
			System.out.println("Validation is fired when user enter the Invalid email in Email field : " + error5);

		} catch (NoSuchElementException e7) {
			e7.getMessage();

		} catch (InterruptedException e8) {
			e8.getMessage();
		}

	}

}
