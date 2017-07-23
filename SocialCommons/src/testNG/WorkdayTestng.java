package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import tooling.EnvironmentCheck;
import org.testng.annotations.DataProvider;
import tooling.ReadExcel;

import work_day_tests.WorkdayTest;

public class CommonsTest {
       public WebDriver driver;
      
       
       
  @DataProvider(name = "Leaves")
       
  public static String[] links() {
	  ReadExcel read = new ReadExcel();
	  String[] input = new String[3];
	  for (int i = 0; i < input.length ;  i++) {
	      input[i] = read.readXLSXFile("C:/Book1.xlsx","Sheet1","Name", i+2);
	      input[i] = input[i].trim();
	   }
	  return input;
  }
  
  
  @Test(dataProvider = "Leaves")
  public void test_workday(String leave) throws InterruptedException {
	  
	  WorkdayTest.navigate_to_timeoff_request(driver);
	  
	  String[] leave_type = leave.split(",");
	  
	  String leave_count = WorkdayTest.get_number_of_leaves(driver, leave_type[0]);
	  
	  Assert.assertEquals(leave_count, leave_type[1]);
	  
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


