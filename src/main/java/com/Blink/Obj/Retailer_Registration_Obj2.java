package com.Blink.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.testcase.Retailer_Registration_Page3;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Obj2 extends Retailer_Registration_Page3 {
	
	
	public @FindBy(xpath = "//a[text()='Service Offering']") WebElement ServiceOfferingbox;
	
	// Element of All Services
	public @FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div[1]/input[@class='search-input form-control']") WebElement All_Services;

	// Element of Selected Services
	public @FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div[2]/input[@class='search-input form-control']") WebElement Selected_Services;

	// Element of All Regions
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[@class='search-input form-control']") WebElement All_Regions;
	public @FindBy(xpath = "//span[(text() = 'Adelaide - Central and Hills' or . = 'Adelaide - Central and Hills')]") WebElement Reg_opt1;
	public @FindBy(xpath = "//span[(text() = 'Adelaide - North' or . = 'Adelaide - North')]") WebElement Reg_opt2;
	public @FindBy(xpath = "//li[@class='ms-elem-selectable']//span[(text() = 'Melbourne - Inner' or . = 'Melbourne - Inner')]") WebElement Reg_opt3;
	public @FindBy(xpath = "//li[@class='ms-elem-selectable']//span[(text() = 'Melbourne - North West' or . = 'Melbourne - North West')]") WebElement Reg_opt4;

	// Element of Selected Regions
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[2]/input[@class='search-input form-control']") WebElement Selected_Regions;
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[2]/ul[@class='ms-list']") WebElement Region_list;
	public @FindBy(xpath = "//div[2]/ul/li[1]/ul/li[1]/span[(text() = 'SA' or . = 'SA')]") WebElement SA;
	public @FindBy(xpath = "//div[2]/ul/li[3]/ul/li[1]/span[(text() = 'VIC' or . = 'VIC')]") WebElement VIC;

	// Element of Next Button
	public @FindBy(xpath = "//button[@id='step2']") WebElement Next_Page1;

}
