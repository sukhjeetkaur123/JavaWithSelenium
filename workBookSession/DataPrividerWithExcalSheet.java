package workBookSession;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPrividerWithExcalSheet {
	 public int a,b;
	    FileInputStream file;
	    XSSFWorkbook bk;
	    XSSFSheet sh;
	    String path;

	    @DataProvider(name="ready")
	    public Object[][] testData() throws IOException {

	    	 path =System.getProperty("user.dir")+"//TestLoginData/ready.xlsx";
	        System.out.println(path);
	        //Reading the Excel file
	        file = new FileInputStream(path);
	        //Reading the workBook
	        bk = new XSSFWorkbook(file);
	        //Reading the sheet
	        sh = bk.getSheetAt(0);
	        a = sh.getLastRowNum();
	        b = sh.getRow(0).getPhysicalNumberOfCells();
	        int row = a;
	        int col = b;
	        System.out.println(row+"     "+col);
	        Object[][] arr = new Object[row+1][2];
	        for (int i=1;i<=row;i++){
	            String data1 = sh.getRow(i).getCell(0).getStringCellValue();
	            String data2 = sh.getRow(i).getCell(1).getStringCellValue();
	            arr[i][0]= data1;
	            arr[i][1] = data2;
	        }
//	        arr[0][0]="standard_user";
//	        arr[0][1]="secret_sauce";
	        return arr;
	    }

	    @Test(dataProvider = "ready")
	    public void login(String name,String pass){
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       
	   	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	   	driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(pass);
	        driver.findElement(By.id("btnLogin")).click();
//	        WebElement s = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
//	        String act = s.getText();
	        driver.close();
//	        Assert.assertEquals(act,"PRODUCTS");
	    }

}
