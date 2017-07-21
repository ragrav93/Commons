package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonsDashBoard {
	private static WebElement element = null;
	
	public static WebElement top_destination(WebDriver driver){
		 
	    element = driver.findElement(By.linkText("Top Destinations"));
	 
	    return element;
	 
	    }
	public static WebElement top_destination_more(WebDriver driver){
		 
	    element = driver.findElement(By.linkText("More..."));
	 
	    return element;
	 
	    }
	public static WebElement commons_home_page(WebDriver driver){
		 
	    element = driver.findElement(By.id("logo"));
	 
	    return element;
	 
	    }
	public static WebElement ask_hub(WebDriver driver){
		 
	    element = driver.findElement(By.linkText("askHub"));
	 
	    return element;
	 
	    }

}
