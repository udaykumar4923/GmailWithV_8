package com.qait.acs.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class SignInPageActions extends GetPage{
	WebDriver driver;
	
	public SignInPageActions(WebDriver driver) {
		super(driver,"signInPage");
	}
	
	public void enterUserId() {
		isElementDisplayed("txt_email");
		element("txt_email").sendKeys("udaykumar4923@gmail.com");
		element("btn_next_btn").click();
	}
	
	public void enterPassword() {
		isElementDisplayed("txt_passwd");
		element("txt_passwd").sendKeys("*****");//enter password here
		element("btn_nextpassword_btn").click();
	}
	
}
