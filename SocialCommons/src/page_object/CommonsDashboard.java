package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_object.PageObjectBase;

public class CommonsDashBoard {
	
	
	public static PageObjectBase top_destination(WebDriver driver){
	    PageObjectBase page_base = new PageObjectBase();
		 
	    page_base.element = driver.findElement(By.linkText("Top Destinations"));
	 
	    return page_base;
	 
	    }
	
	public static PageObjectBase top_destination_more(WebDriver driver){
	    PageObjectBase page_base = new PageObjectBase();
		 
	    page_base.element = driver.findElement(By.linkText("More..."));
	 
	    return page_base;
	 
	    }
	
	public static PageObjectBase commons_home_page(WebDriver driver){
	    PageObjectBase page_base = new PageObjectBase();
		 
	    page_base.element = driver.findElement(By.id("logo"));
	 
	    return page_base;
	 
	    }
	
	public static PageObjectBase ask_hub(WebDriver driver){
	    PageObjectBase page_base = new PageObjectBase();
		 
	    page_base.element = driver.findElement(By.linkText("askHub"));
	 
	    return page_base;
	 
	    }
	
	public static PageObjectBase workday_link(WebDriver driver){
	    PageObjectBase page_base = new PageObjectBase();

            page_base.element = driver.findElement(By.linkText("Workday (PTO, Performance, Feedback)"));

            return page_base;

        }

}
