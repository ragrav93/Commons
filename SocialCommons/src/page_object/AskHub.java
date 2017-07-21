package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AskHub {


	public static WebElement identity_iq(WebDriver driver){
		 
	    WebElement element = driver.findElement(By.linkText("New desk issues"));
	 
	    return element;
	 
	    }
	
	public static WebElement video_title(WebDriver driver){
		 
	    WebElement element = driver.findElement(By.xpath(".//*[@id='jive-body-main']/div[2]/div/div[2]/header"));
		
	 
	    return element;
	 
	    }

}
