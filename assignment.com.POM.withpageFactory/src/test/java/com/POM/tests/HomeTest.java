package com.POM.tests;

import org.testng.annotations.Test;

import com.POM.pages.HomePage;
import com.testBase.TestBase;

public class HomeTest extends TestBase {
	public HomeTest() {
		super();
		
	}

	@Test
	public void verifyHometitle() {
		obj.getHomeData().verifyTitle();
	}
	@Test(priority = 1)
	public void verifyAddToCartTab() throws InterruptedException {
		obj.getHomeData().clickOnAddToCart();
	}
	
   
	
   @Test
  public void clickOnFilterButtonForEveryOption() {
	   obj.getHomeData().clickOnfilterbutton();
   }
//   @Test
// public  void submittedDetailsIntiChechOutPage() {
//	   obj.getHomeData().inputIntocheckForChechOut();
//   }
}
