package com.qait.acs.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class GmailTest {
	TestSessionInitiator testSessionInitiator;
	
	@BeforeTest
	public void launchBrowser() {
		testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
		testSessionInitiator.launchApplication();
	}
	
	@Test
	public void verifyLogin() {
		testSessionInitiator.SignInPage.enterUserId();
		testSessionInitiator.SignInPage.enterPassword();
	}
	
	@AfterTest
	public void closeBrowser() {
		//testSessionInitiator.driver.close();
		//testSessionInitiator.driver.quit();
	}
}
