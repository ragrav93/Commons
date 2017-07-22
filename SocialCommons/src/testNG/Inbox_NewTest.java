package DriverPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Excel.ReadExcel;

public class Inbox_NewTest {
	
	public static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  ReadExcel read = new ReadExcel();
	  String solution = read.readXLSXFile("C:/Book1.xlsx","Sheet1","Name",2);
	  System.out.println(solution);
	  inbox_testscript.main_func(driver,solution);
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
  	driver = new ChromeDriver(options);
  	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  	inbox_testscript.init_page(driver);
      
  }

  @AfterMethod
  public void afterMethod() {
	  inbox_testscript.close_page(driver);
  }

}
