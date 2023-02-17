package com.Blink.testcase;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Blink.Obj.LoginPage_Obj;

/**
 * @author Bhavin.Thumar
 *
 */

public class Login_Page extends LoginPage_Obj {

	public void InvalidPass(String id, String pass) throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		w.until(ExpectedConditions.visibilityOf(Email));
		Email.sendKeys(id);
		Password.sendKeys(pass);
		Login_button.click();

		w.until(ExpectedConditions.visibilityOf(passwordMessage));
		String Expecetdtitle1 = "Incorrect email or password.";
		String toasttitle1 = passwordMessage.getText();
		System.out.println(" 1) Error message is appear when user enter Invalid Password : " + toasttitle1);
		Assert.assertEquals(toasttitle1, Expecetdtitle1);

	}

	public void InvalidId(String id, String pass) throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		w.until(ExpectedConditions.visibilityOf(Email));
		Email.clear();
		Email.sendKeys(id);
		Password.clear();
		Password.sendKeys(pass);
		Login_button.click();

		w.until(ExpectedConditions.visibilityOf(passwordMessage));
		String Expectedtitle2 = "Incorrect email or password.";
		String toasttitle2 = passwordMessage.getText();
		System.out.println(" 2) Error message is appear when user enter Invalid ID : " + toasttitle2);
		Assert.assertEquals(toasttitle2, Expectedtitle2);
	}

	public void InvalidId_Pass(String id, String pass) throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		w.until(ExpectedConditions.visibilityOf(Email));
		Email.clear();
		Email.sendKeys(id);
		Password.clear();
		Password.sendKeys(pass);
		Login_button.click();

		w.until(ExpectedConditions.visibilityOf(passwordMessage));
		String Expectedtitle3 = "Incorrect email or password.";
		String toast = passwordMessage.getText();
		System.out.println(" 3) Error message is appear when user enter Invalid ID and Password : " + toast);
		Assert.assertEquals(toast, Expectedtitle3);

	}

	public void ValidId_Pass(String id, String pass) throws InterruptedException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));

		w.until(ExpectedConditions.visibilityOf(Email));
		Email.clear();
		Email.sendKeys(id);
		Password.clear();
		Password.sendKeys(pass);
		Login_button.click();

		w.until(ExpectedConditions.visibilityOf(Profile_button));
		String Actual_URL = driver.getCurrentUrl();
		String Expected_URL = "https://admin.stage.blinkecosystem.com.au/";
		if (Actual_URL.equals(Expected_URL)) {
			System.out.println(Actual_URL + " : URL is matched");
		} else {
			System.out.println("URL is not matched");
		}

		Profile_button.click();
		Logout_button.click();

		Thread.sleep(3000);

		String Actual = driver.getTitle();
		String Expected = "Blink";

		if (Actual.equals(Expected)) {
			System.out.println(Actual + " : Page is matched ");
		} else {
			System.out.println("Page is not matched");
		}

	}

}
