package com.POM.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(partialLinkText = "Welcome")
	WebElement clickOnprofile;
	@FindBy(linkText = "Logout")
	WebElement logutButton;
	@FindBy(className ="shopping_cart_link")
	WebElement verifyAddcartbutton;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement selectDropDownFromFilter;
	@FindBy(xpath="//option[contains(text(),'Price (high to low)')]")
	WebElement selectOption4th;
	@FindBy(xpath = "//option[contains(text(),'Price (low to high)')]")
	WebElement selectOption3;
	@FindBy(xpath="//option[contains(text(),'Name (Z to A)')]")
	WebElement selectOption2;
	@FindBy(xpath = "//option[contains(text(),'Name (A to Z)')]")
	WebElement selectOption1;
	@FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addToCart;
	@FindBy(xpath = "//span[@class=\"shopping_cart_badge\"]")
	WebElement selectAddToCartOption;
	@FindBy(className = "cart_desc_label")
	WebElement verifyAddToCartWindow;
	@FindBy(id = "checkout")
	WebElement checkOutbuttonl;
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName1;
	@FindBy(id="last-name")
	WebElement lastName1;
	@FindBy(id="postal-code")
	WebElement pinCode1;
	@FindBy(id="continue")
	WebElement continueButton;
	 
	public HomePage() {
	
		PageFactory.initElements(driver,this);
	}
	
//	public void logout() {
//		clickOnprofile.click();
//		logutButton.click();
//		
//	}
//	public void clickOnfilterbutton() throws InterruptedException {
//		selectDropDownFromFilter.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
//		selectOption2.click();
//		selectDropDownFromFilter.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
//		selectOption4th.click();
//
//		
//
//      }
	public void inputIntocheckForChechOut()  {
		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfAllElements(firstName1));
	firstName1.sendKeys(prop.getProperty("firstName"));
		lastName1.sendKeys(prop.getProperty("lastName"));
		pinCode1.sendKeys(prop.getProperty("pinCode"));
		continueButton.click();
		
	}
	public void clickOnfilterbutton() {
		selectDropDownFromFilter.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		String option = prop.getProperty("option");
		WebElement clickOption = driver.findElement(By.xpath("//option[contains(text(),'"+option+"')]"));
		clickOption.click();
		
	}
	
	public void clickOnAddToCart() throws InterruptedException {
		addToCart.click();
		Thread.sleep(3000);

		selectAddToCartOption.click();
		assertTrue(verifyAddToCartWindow.isDisplayed());
		checkOutbuttonl.click();
	}
	public void  verifyTitle() {
		Assert.assertTrue(verifyAddcartbutton.isDisplayed());
		
	}
 
}
