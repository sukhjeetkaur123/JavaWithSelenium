package com.POM.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.POM.pages.LoginPage;
import com.testBase.TestBase;

public class LoginTest extends TestBase {
	
	LoginPage lp;
	String actualTitle;
	public LoginTest() {
		super();
		
	}
	
	@BeforeSuite
	public void launch() {
		intialization();
		lp = new LoginPage();
		
	}
	@Test
	public void chechTitle() {
	actualTitle=lp.verifyTitle();
	Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	@Test
	void loginDetail() throws IOException{
		lp.login();
	
	}
	@Test
	void forgetpass() {
		lp.forgetPassword();
	}
	

}
