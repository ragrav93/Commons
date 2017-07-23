package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.PageObjectBase;

public class AskHub {

	public static PageObjectBase identity_iq(WebDriver driver){
		PageObjectBase page_base = new PageObjectBase();
		page_base.element = driver.findElement(By.linkText("New desk issues"));
	    return page_base;	 
	    }
	
	public static PageObjectBase video_title(WebDriver driver){
		PageObjectBase page_base = new PageObjectBase();
		page_base.element = driver.findElement(By.xpath(".//*[@id='jive-body-main']/div[2]/div/div[2]/header"));
	    return page_base;
	    }
}
