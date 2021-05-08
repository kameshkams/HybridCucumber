package testCases;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.Library;
import pages.LoginPage;
import utilities.SeleniumUtilities;

public class LoginTestCase extends Library{

	
	@BeforeTest
	public void stratUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.login("admin", "admin123");
		
		
	}
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities util = new SeleniumUtilities(driver);
		util.to_take_screenshot("src/test/resources/Screenshots/orangehrm.png");
		quit();
		
	}
}
