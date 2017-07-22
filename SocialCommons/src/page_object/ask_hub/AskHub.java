package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.page_object_base;

public class AskHub {

	public static page_object_base identity_iq(WebDriver driver){
		page_object_base page_base = new page_object_base();
		page_base.element = driver.findElement(By.linkText("New desk issues"));
	    return page_base;	 
	    }
	
	public static page_object_base video_title(WebDriver driver){
		page_object_base page_base = new page_object_base();
		page_base.element = driver.findElement(By.xpath(".//*[@id='jive-body-main']/div[2]/div/div[2]/header"));
	    return page_base;
	    }
}
