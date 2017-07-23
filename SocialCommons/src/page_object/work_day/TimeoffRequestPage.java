package work_day_page_objects;
import org.openqa.selenium.*;
import page_object.PageObjectBase;
public class TimeoffRequestPage {
	public static PageObjectBase casual_leave(WebDriver driver){
		PageObjectBase page_base = new PageObjectBase();
		 
		page_base.element = driver.findElement(By.id("56$263237--uid22"));

        return page_base;

        }
	
	public static PageObjectBase privileged_leave(WebDriver driver){
		PageObjectBase page_base = new PageObjectBase();
		 
		page_base.element = driver.findElement(By.id("56$263237--uid19"));
		
        return page_base;

        }
	
	public static PageObjectBase sick_leave(WebDriver driver){
		PageObjectBase page_base = new PageObjectBase();
		 
		page_base.element = driver.findElement(By.id("56$263237--uid16"));
		
		return page_base;

        }
}
