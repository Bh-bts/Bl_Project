package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Blink.Obj.Retailer_Registration_Obj3;
import com.github.javafaker.Faker;

public class Val_Retailer_Registration_Page3 extends Retailer_Registration_Obj3 {

	public void AllVal_ContactDetails() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(10000);

			js.executeScript("arguments[0].scrollIntoView(true);", Next_Page2);
			js.executeScript("arguments[0].style.border='2px solid red'", Next_Page2);
			Next_Page2.click();

			Thread.sleep(7000);
			System.out.println("All validation of page3 ---------------------------------------------------------------------------------------------------- ");
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation1);
			String error1 = validation1.getText();
			System.out.println("Validation is fired when user not upload the Bill_Police Check attachment field : " + error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation2);
			String error2 = validation2.getText();
			System.out.println("Validation is fired when user not upload the Bill_Driver's Licence attachment field : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation3);
			String error3 = validation3.getText();
			System.out.println("Validation is fired when user not fill up any content in Bill_Driver's Licence Number field : " + error3);
					
			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error4 = validation4.getText();
			System.out.println("Validation is fired when user not fill up any contact in Bill_Contact Number field : " + error4);

			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error5 = validation5.getText();
			System.out.println("Validation is fired when user not fill up any content in Bill_Email field : " + error5);

			js.executeScript("arguments[0].style.border='2px solid red'", validation6);
			String error6 = validation6.getText();
			System.out.println("Validation is fired when user not fill up any content in Bill_Last Name field : " + error6);

			js.executeScript("arguments[0].style.border='2px solid red'", validation7);
			String error7 = validation7.getText();
			System.out.println("Validation is fired when user not fill up any content in Bill_First Name field : " + error7);

			js.executeScript("arguments[0].style.border='2px solid red'", validation8);
			String error8 = validation8.getText();
			System.out.println("Validation is fired when user not fill up any content in Bill_Position field : " + error8);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation9);
			String error9 = validation9.getText();
			System.out.println("Validation is fired when user not upload the Police Check attachment field : " + error9);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation10);
			String error10 = validation10.getText();
			System.out.println("Validation is fired when user not upload the Driver's Licence attachment field : " + error10);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation11);
			String error11 = validation11.getText();
			System.out.println("Validation is fired when user not upload the Driver's Licence Number field : " + error11);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation12);
			String error12 = validation12.getText();
			System.out.println("Validation is fired when user not fill up any contact in Contact Number field : " + error12);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation13);
			String error13 = validation13.getText();
			System.out.println("Validation is fired when user not fill up any contact in Email field : " + error13);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation14);
			String error14 = validation14.getText();
			System.out.println("Validation is fired when user not fill up any contact in Last Name field : " + error14);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation15);
			String error15 = validation15.getText();
			System.out.println("Validation is fired when user not fill up any contact in First Name field : " + error15);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation16);
			String error16 = validation16.getText();
			System.out.println("Validation is fired when user not fill up any contact in Position field : " + error16);
			js.executeScript("arguments[0].scrollIntoView(true);", validation16);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
	
	public void RestVal_ContactDetails() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(10000);

			// Operational Contact Details

			js.executeScript("arguments[0].scrollIntoView();", Position);
			Faker faker = new Faker();
			String pos = faker.job().position();
			Position.sendKeys(pos);

			String fname = faker.name().firstName();
			FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			LastName.sendKeys(lname);

			String email = fname.toLowerCase() + "." + lname.toLowerCase();
			Email.sendKeys(email);

			String contNum = faker.number().digits(2);
			ContactNumber.sendKeys(contNum);

			String licnumber = faker.number().digits(12);
			Driv_Lic_No.sendKeys(licnumber);

			String projectpath = System.getProperty("user.dir");
			Driver_Lic.sendKeys(projectpath + "\\SampleData\\flower.jpg");
			Police_Check.sendKeys(projectpath + "\\SampleData\\sample_pdf.pdf");
			Work_Vul.sendKeys(projectpath + "\\SampleData\\Sample-PNG-Image.png");
			Work_Child.sendKeys(projectpath + "\\SampleData\\flower.jpg");

			// Billing Contact Details

			String billPos = faker.job().position();
			Bill_Position.sendKeys(billPos);

			String billfname = faker.name().firstName();
			Bill_FirstName.sendKeys(billfname);

			String billlname = faker.name().lastName();
			Bill_LastName.sendKeys(billlname);

			String billemail = billfname.toLowerCase() + "." + billlname.toLowerCase();
			Bill_Email.sendKeys(billemail);

			String billcontNum = faker.number().digits(2);
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
			Thread.sleep(10000);
			System.out.println("Rest of validation of page3 ---------------------------------------------------------------------------------------------------- ");
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error17 = validation4.getText();
			System.out.println("Validation is fired when user enter the less than 9 digits in Bill_Contact Number field : " + error17);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error18 = validation5.getText();
			System.out.println("Validation is fired when user enter the invalid email address in Bill_Email field : " + error18);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation12);
			String error19 = validation12.getText();
			System.out.println("Validation is fired when user enter the less than 9 digits in Contact Number field : " + error19);
			
			js.executeScript("arguments[0].style.border='2px solid red'", validation13);
			String error20 = validation13.getText();
			System.out.println("Validation is fired when user enter the invalid email address in Email field : " + error20);

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

}
