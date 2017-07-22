package work_day_page_objects;
import org.openqa.selenium.*;
public class TimeoffRequestPage {
	private static WebElement element = null;
	
	public static WebElement apply_button(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='workdayApplicationFrame']/div[1]/div[2]/section/div[2]/div[1]/div[1]/button[1]/span[2]"));

        return element;

        }

}
