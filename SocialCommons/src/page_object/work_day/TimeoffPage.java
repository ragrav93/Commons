package work_day_page_objects;
import org.openqa.selenium.*;
import page_object.PageObjectBase;
public class TimeoffPage {
	
	public static PageObjectBase timeoff_button(WebDriver driver){
		
		PageObjectBase page_base = new PageObjectBase(); 
		 
        	page_base.element = driver.findElement(By.id("2997$275"));

        	return page_base;

        }

}
