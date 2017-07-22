package test_suite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tooling.EnvironmentCheck;

import work_day_page_objects.TimeoffRequestPage;
//import Excel.ReadExcel;

import work_day_tests.WorkdayTest;

public class WorkdayTestng {
       public WebDriver driver;
       
  
  @Test
  public void test_workday() throws InterruptedException {
	  WorkdayTest.navigate_to_timeoff_request(driver);
	  //ReadExcel read = new ReadExcel();
	  //String solution = read.readXLSXFile("C:/Book1.xlsx","Sheet1","Name",2);
	  String pattern = "(\\d+)(.*)";
	  Pattern regex = Pattern.compile(pattern);
	  String button_text = TimeoffRequestPage.apply_button(driver).getText();
	  Matcher match_pattern = regex.matcher(button_text);
	  boolean result;
	  if (match_pattern.find( )) {		  
		   result = match_pattern.group(1).equals("1");
	  }else{
		  result = false; 
	  }
	  Assert.assertTrue(result, "Test Case for matching the text and number of leaves");
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {         
         int status = EnvironmentCheck.getResponseCode("https://social.athenahealth.com");
         if (status == 200){
        	 driver = new ChromeDriver();
        	 driver.get("https://social.athenahealth.com");
        	 driver.manage().window().maximize();
        	 WorkdayTest.navigate_to_workday(driver);
         }else{
        	 System.out.println("Sever is down. Try again later!!!!");
        	 System.exit(0);
        	 
         }
  }

  @AfterMethod
  public void afterMethod() {
         driver.quit();
  }

}


