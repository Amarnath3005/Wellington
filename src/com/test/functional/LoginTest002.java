package com.test.functional;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.generic.CreateDriver;
import com.test.ui.LoginPage;
//Login with InValid credentials
public class LoginTest002 {
	
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
		public void TestInvalid()
		{
			
			LoginPage.getUserName().sendKeys("amar.v@gmail.com");
			LoginPage.getPassword().sendKeys("asbcdef");
		    LoginPage.getLoginButton().click(); 
		}
	}


