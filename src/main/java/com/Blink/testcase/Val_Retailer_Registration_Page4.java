package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Blink.Obj.Retailer_Registration_Obj4;

public class Val_Retailer_Registration_Page4 extends Retailer_Registration_Obj4 {

	public void AllVal_OtherDetails() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(10000);
			System.out.println("All validation of page4 ---------------------------------------------------------------------------------------------------- ");

			js.executeScript("arguments[0].scrollIntoView(true);", submit);
			js.executeScript("arguments[0].style.border='2px solid red'", submit);
			submit.click();
			Thread.sleep(10000);

			js.executeScript("arguments[0].style.border='2px solid red'", validation1);
			String error1 = validation1.getText();
			System.out.println("Validation is fired when user not upload the Work Insurance attachment : " + error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation2);
			String error2 = validation2.getText();
			System.out.println(
					"Validation is fired when user not upload the Professional Indemnity attachment : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation3);
			String error3 = validation3.getText();
			System.out
					.println("Validation is fired when user not upload the Public Liabilities attachment : " + error3);

			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error4 = validation4.getText();
			System.out.println(
					"Validation is fired when user not fill up any content in Account Number field : " + error4);

			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error5 = validation5.getText();
			System.out.println("Validation is fired when user not fill up any content in BSB field : " + error5);

			js.executeScript("arguments[0].style.border='2px solid red'", validation6);
			String error6 = validation6.getText();
			System.out
					.println("Validation is fired when user not fill up any content in Account Name field : " + error6);

			js.executeScript("arguments[0].style.border='2px solid red'", validation7);
			String error7 = validation7.getText();
			System.out.println("Validation is fired when user not fill up any content in Bank Name field : " + error7);
			js.executeScript("", validation7);

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}

}
