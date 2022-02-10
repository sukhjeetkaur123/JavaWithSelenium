package stepDefinition;


import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
	
	@Then("^user click to logout button$")
	public void clickOnlogoutButton() {
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
    
	@Then("^User enter the \"([^\"]*)\" into username field and \"([^\"]*)\" into password field$")
	public void enterUserNameAndPassWord(String userName, String pass) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}
	
	  
	  @Then("^user click on Add user$")
		public void clickOnAddUserButton () throws InterruptedException {
			
		  Actions action = new Actions(driver);

	        action.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"))).build().perform();
	        action.moveToElement(driver.findElement(By.xpath("//a[@id=\"menu_admin_UserManagement\"]"))).build().perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]")).click();
		}
	  
	  @Then("^user fill \"([^\"]*)\" and username and \"([^\"]*)\" and confirm pass$")
	  public void addUserDetails(String empName,String pass) throws InterruptedException {
		  driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
	        WebElement empName1 = driver.findElement(By.xpath("//input[@id=\"systemUser_employeeName_empName\"]"));
	        empName1.sendKeys(empName);
	        empName1.sendKeys(Keys.ENTER);

	       
	        driver.findElement(By.xpath("//input[@id=\"systemUser_password\"]")).sendKeys(pass);
	        driver.findElement(By.xpath("//input[@id=\"systemUser_confirmPassword\"]")).sendKeys(pass);
	    
	  }
	  
	
	  @Then("^user delelete button by current \"([^\"]*)\"$")
	  public void deleteUserByUserName(String username) throws InterruptedException
	  {	  
	  WebElement name = driver.findElement(By.xpath("//input[@id=\"systemUser_userName\"]"));
      name.click();
      Random randomGenerator = new Random();
      int randomInt = randomGenerator.nextInt(1000);
      String getUserNameText = username+randomInt;
      name.sendKeys(getUserNameText);
      System.out.println(getUserNameText);
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
      Thread.sleep(6000);
      
      WebElement searchUser = driver.findElement(By.xpath("//input[@id=\"searchSystemUser_userName\"]"));
      searchUser.sendKeys(getUserNameText);
      driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
      WebElement checkBox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
      checkBox.click();
      WebElement deleteButton = driver.findElement(By.xpath("//input[@id=\"btnDelete\"]"));
      deleteButton.click();
      WebElement confirmDelete = driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]"));
      confirmDelete.click();
      Thread.sleep(3000);
      
	  }
	  @When("^enters the username and enters the password$")
	 public void enters_the_username_and_enters_the_password(io.cucumber.datatable.DataTable dataTable)
	 {
	 List<List<String>> data = dataTable.asLists(String.class);
	 driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
	 }
	  

		@Then("^user click on time button$")
		public void clickOnTimeSheetButton() {
			driver.findElement(By.className("main-menu-first-level-list-item")).click();
			
		}
		
		@Then("^enter the emp details \"([^\"]*)\"$")
		public void enterEmpDetails(String empDetals) {
		WebElement empInfo =	driver.findElement(By.id("employee"));
		empInfo.sendKeys(empDetals);
		empInfo.sendKeys(Keys.ENTER);
			
		}
		
		@Then("^click on view button$")
		public void clickOnViewbutton() {
			driver.findElement(By.id("btnView")).click();
			WebElement timeSheetView =driver.findElement(By.id("btnAddTimesheet"));
			if(timeSheetView.isDisplayed()) {
				timeSheetView.click();
			}
			else {
				
			}
			
			
		}
		
		
	  
}
