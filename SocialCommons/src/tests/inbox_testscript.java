package DriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;;


public class inbox_testscript {

	//Main function trigger by @test annotation.
	public static void main_func(WebDriver driver, String solution) throws InterruptedException {
		
		//Function call to find inbox element in the home page.
		WebElement inboxelem = inboxObjects.inbox_element(driver);
		inboxelem.click();
		Thread.sleep(5000);
		  
		//Function call to find send message button in the inbox page.
		WebElement sendmessageelem = inboxObjects.sendmessage_element(driver);
		sendmessageelem.click();
		  
		//driver.findElement(By.cssSelector("#j-js-inbox-send-dm > span.j-ui-elem")).click();
		//Function calls to find various elements from the send message dialog.
    	  WebElement recipients = inboxObjects.recipient_element(driver);
	  	  WebElement subject =   inboxObjects.subject_element(driver);
	  	  WebElement message = inboxObjects.message_element(driver);
	  	  
	  	  //String array to use if data not taken from excel sheet.
	  	  //String[] namearray = {"Jayaprakash Pandurangan", "Raghul Ravichandran", "Suganyashree ashok kumaar"};

	  	  //Data obtained from excel sheet retrieved as a parameter for this function
	  	  String namearray = solution;
//	  	  for(String name : namearray){
//	  		  System.out.println(recipients.isDisplayed());
	  		  recipients.sendKeys(namearray);
           Thread.sleep(10000);
	      WebElement selectrecipient = inboxObjects.selectrecipient_element(driver);
	      if (selectrecipient.isDisplayed()){
	    	  selectrecipient.click();
	      }
	  	  
	  	  subject.sendKeys("Test message");
	  	  message.sendKeys("All the Best!!");
	  	  WebElement submit = inboxObjects.submit_element(driver);
	  	  if(submit.isDisplayed()){
	  	   System.out.println(submit.isDisplayed());
	  	   submit.click();
	  	   Thread.sleep(10000);
	  	}

}

    //Initialize function triggered @BeforeMethod.
   
    public static void init_page(WebDriver driver) throws InterruptedException {
    	driver.navigate().to("https://social.athenahealth.com/welcome");
		Thread.sleep(5000);
        
    }

    
    //Closing function triggered @AfterMethod.
    public static void close_page(WebDriver driver) {
  	  driver.quit();
    }

		
	}
