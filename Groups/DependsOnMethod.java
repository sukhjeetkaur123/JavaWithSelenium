package Groups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnMethod {
	String pathdriver;
	WebDriver driver;
	@BeforeSuite
	public void Launch()
	{
		pathdriver=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.out.println(pathdriver);
		
		System.setProperty("webdriver.chrome.driver", pathdriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test( enabled=true )
	public void login()
	{
		System.out.println("Login code");
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("logout code");
	}
	@AfterSuite
	public void Close()
	{
		driver.close();
	}

}
