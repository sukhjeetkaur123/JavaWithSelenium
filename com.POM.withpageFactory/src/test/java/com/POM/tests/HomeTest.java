package com.POM.tests;

import org.testng.annotations.Test;

import com.POM.pages.HomePage;
import com.testBase.TestBase;

public class HomeTest extends TestBase {
	public HomeTest() {
		super();
		
	}
	 @Test
	 void clickOnLogOut() {
		
		 obj.getHomeData().logout();
	 }

}
