package com.test.functional;


import org.testng.annotations.Test;
import com.test.generic.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.test.ui.LoginPage;
//Login with Valid credentials
public class LoginTest001 {
	
	WebDriver driver= CreateDriver.getDriver();
		LoginPage login = new LoginPage(driver);
		@BeforeMethod
		public void preTest()
		{
			
		}
		@AfterMethod
		public void postTest()
		{
		
			driver.close();
		}
		@Test
		public void testLogin()
		{
			LoginPage.getUserName().sendKeys("amar.vattigunta@gmail.com");
			LoginPage.getPassword().sendKeys("Inspiron14");
		    LoginPage.getLoginButton().click(); 
		}
		
	}

