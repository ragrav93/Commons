package work_day_page_objects;
import org.openqa.selenium.*;
public class WorkdayPage {
	
private static WebElement element = null;
	
	public static WebElement workday_ul(WebDriver driver){
		 
        element = driver.findElement(By.className("WBSG"));

        return element;

        }

}
