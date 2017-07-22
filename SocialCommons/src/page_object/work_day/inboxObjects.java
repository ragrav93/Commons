package DriverPackage;

import java.util.List;

import org.openqa.selenium.*;

public class inboxObjects {

	public static WebElement element = null;
	
	//Function to retrieve all link elements from a page.
	public static List<WebElement> link_elements(WebDriver driver){
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		return alllink;
	}
	
	
	//Function to retrieve particular element from the link elements.
	 public static WebElement inbox_element(WebDriver driver)
	 {
		 List<WebElement> alllinks;
		 WebElement dummy = driver.findElement(By.id("logo"));
		 alllinks = link_elements(driver);
		  for (WebElement element : alllinks ){
			  if(element.getText().contains("Inbox")){
				  dummy = element ;
			  }	  
			}
		  return dummy;
    }
	 
	 public static WebElement sendmessage_element(WebDriver driver)
	 {
		 List<WebElement> alllinks;
		 WebElement dummy = driver.findElement(By.xpath(".//*[@id='autosearch']"));
		 alllinks = link_elements(driver);
		  for (WebElement element : alllinks ){
			  if(element.getText().contains("Send Message")){
				  dummy = element ;
			  }	  
			}
		  return dummy;
    }
	 
	 public static WebElement recipient_element(WebDriver driver)
	 {
	 element = driver.findElement(By.id("recipients"));
	 return element;
     }
	 
	 public static WebElement subject_element(WebDriver driver)
	 {
	 element = driver.findElement(By.xpath(".//*[@id='j-rtc-subject']"));
	 return element;
     }
	 
	 public static WebElement message_element(WebDriver driver)
	 {
	 element = driver.findElement(By.xpath(".//*[@id='message-direct-message-text']"));
	 return element;
     }
	 
	 public static WebElement selectrecipient_element(WebDriver driver)
	 {
	 element = driver.findElement(By.cssSelector("a[id^='user']"));
	 return element;
     }
	 
	 public static WebElement submit_element(WebDriver driver)
	 {
	 element = driver.findElement(By.xpath("html/body/div[8]/div/form/div[3]/input"));
	 return element;
	 }
}
