import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class AskHubNewTest extends AskHubTestScript  {
	
	 public static WebDriver driver;
	 

	//	 TestListenerAdapter.onTestFailure.class;
			
	 
  @BeforeMethod
  public void beforeMethod() {
	  driver = initiate_driver();
	  navigate_to_dashboard (driver); 
  }
  
  @Test
  public void f() throws Exception {
	  play_video ( driver);
	  Thread.sleep(4000);
	  AssertJUnit.assertTrue(validate_title());
	  getscreenshot(driver,"C:\\Users\\pjayaprakash\\Desktop\\screenshot\\askhub.png");
	 
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  back_to_dashboard(driver);
  }

}
