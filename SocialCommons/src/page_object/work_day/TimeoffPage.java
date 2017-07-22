package work_day_page_objects;
import org.openqa.selenium.*;
public class TimeoffPage {
	
private static WebElement element = null;
	
	public static WebElement timeoff_button(WebDriver driver){
		 
        element = driver.findElement(By.id("2997$275"));

        return element;

        }

}
