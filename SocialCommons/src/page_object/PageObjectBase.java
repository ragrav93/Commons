package page_object;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.StaleElementReferenceException;


public class PageObjectBase { 
	public WebElement element;
	public String k = null;
	

public void element_set(WebElement j) {
	element = j;
}

public void click()  {
	click(1);
}

public void click(int count)  {
	try {
		element.click();
	}
	catch (StaleElementReferenceException exp) {
		if (count>0)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
			click(count);
		}
	}
}

public String getText() {
	k=getText(1);
	return k;
}



public String getText(int count) {
	k = null;
	
	try {
		k = element.getText();
		return k;
	}
	catch (StaleElementReferenceException exp) {
		if (count>0)
		{
			count--;
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			getText(count);
		}
		
		return k;
	}
}

}
