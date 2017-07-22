package work_day_tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import work_day_page_objects.CommonsPage;
import work_day_page_objects.TimeoffPage;
import work_day_page_objects.WorkdayPage;

public class WorkdayTest {
	
	public static void navigate_to_workday(WebDriver driver) throws InterruptedException{
		CommonsPage.destinations_link(driver).click();
        CommonsPage.workday_link(driver).click();
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
		Thread.sleep(20000);
	}
	
	public static void navigate_to_timeoff_request(WebDriver driver) throws InterruptedException{
		WebElement item_ul = WorkdayPage.workday_ul(driver);
		  List<WebElement> workday_items = item_ul.findElements(By.tagName("li"));
		  workday_items.get(3).click();
		  Thread.sleep(10000);
		  TimeoffPage.timeoff_button(driver).click();
		  Thread.sleep(10000);
	}

}
