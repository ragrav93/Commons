package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_object.CommonsDashboard;
import page_object.TimeoffPage;
import page_object.WorkdayPage;
import page_object.TimeoffRequestPage;

public class WorkdayTest {
	
	public static void navigate_to_workday(WebDriver driver) throws InterruptedException{
	CommonsDashboard.top_destination(driver).click(5);
        CommonsDashboard.workday_link(driver).click(5);
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
	}
	
	public static void navigate_to_timeoff_request(WebDriver driver) throws InterruptedException{
		WebElement item_ul = WorkdayPage.workday_ul(driver);
		  List<WebElement> workday_items = item_ul.findElements(By.tagName("li"));
		  workday_items.get(3).click();
		  TimeoffPage.timeoff_button(driver).click();
	}
	
	public static String get_number_of_leaves(WebDriver driver, String leave_type) throws InterruptedException{
		if(leave_type.equals("Casual Leave")){
			return TimeoffRequestPage.casual_leave(driver).getText(5);
		}else if (leave_type.equals("Privileged Leave")){
			return TimeoffRequestPage.privileged_leave(driver).getText(5);
		}else if (leave_type.equals("Sick Leave")){
			return TimeoffRequestPage.sick_leave(driver).getText(5);
		}
		return "Not found";
	}

}
