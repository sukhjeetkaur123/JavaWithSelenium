package com.POM.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class LoginPage extends TestBase{
	
//	WebDriver driver;
//	 page factory class
	@FindBy(id = "user-name")
	WebElement userName1;
	
	@FindBy(id="password")
	WebElement password1;
	
	@FindBy(id = "login-button")
	WebElement loginButton;
	
	
	
	public LoginPage() {
				
		PageFactory .initElements(driver, this);
		
	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}

	public void login() {
		
		   userName1.sendKeys(prop.getProperty("username"));
	       password1.sendKeys(prop.getProperty("pass"));
	       loginButton.click();
	}


}
