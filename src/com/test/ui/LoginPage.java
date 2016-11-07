package com.test.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Step 3
		static WebDriver driver;
		//Step 4
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		//Step 2
		public static WebElement getUserName()
		{
			WebElement un=  driver.findElement(By.id("login_field"));
			return un;
		}
		public static WebElement  getPassword()
		{
			return driver.findElement(By.name("password"));
		}
		public static WebElement getLoginButton()
		{
			return driver.findElement(By.name("commit"));
		}
		/*public WebElement getkeepMeLoggedInCheckbox()
		{
			return driver.findElement(By.id("keepLoggedInCheckBox"));
		*/
		

}
