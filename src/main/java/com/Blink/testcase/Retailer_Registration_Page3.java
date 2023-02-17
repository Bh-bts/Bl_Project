package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Blink.Obj.Retailer_Registration_Obj3;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Page3 extends Retailer_Registration_Obj3 {

	public void ContactDetailsPage() {
		
		String color = ContactDetailsbox.getCssValue("color");
		String backcolor = ContactDetailsbox.getCssValue("background-color");
		
		if(!color.equals(backcolor)) {
			System.out.println("Contact Details is highlighted");
		} else {
			System.out.println("Contact Details is not highlighted");
		}
		
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

			String domainName = "@gmail.com";
			String email = fname.toLowerCase() + "." + lname.toLowerCase() + domainName;
			Email.sendKeys(email);

			String contNum = faker.number().digits(10);
			ContactNumber.sendKeys(contNum);

			String licnumber = faker.number().digits(12);
			Driv_Lic_No.sendKeys(licnumber);

			String projectpath = System.getProperty("user.dir");
			Driver_Lic.sendKeys(projectpath + "\\SampleData\\flower.jpg");
			Police_Check.sendKeys(projectpath + "\\SampleData\\sample_pdf.pdf");
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

}
