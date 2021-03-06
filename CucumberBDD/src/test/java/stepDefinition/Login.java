package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_on_ogin_oage() {
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	   
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
	}
	
	@Then("^user enter the username into username field$")
	public void enterUserName() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Then("^user enter the password into password field$")
	public void enterPassword() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Then("^user click on login button$")
	public void clickOnLoginbutton() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("^user is on home page$")
	public void verifyTitle() {
	  Assert.assertEquals("OrangeHRM",driver.getTitle());
	}


}
