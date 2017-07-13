package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
       public WebDriver driver;
       
  @Test
  public void main() throws InterruptedException {
         driver.navigate().to("https://www.facebook.com");
         WebElement username = driver.findElement(By.id("email"));
      WebElement password = driver.findElement(By.id("pass"));
      System.out.println(username);
      if (username.isEnabled() && password.isEnabled() )
      {
      username.click();
      username.sendKeys("ratnajenisha@gmail.com");
      password.click();
      password.sendKeys("NiceTry");
      }
      WebElement submitbutton = driver.findElement(By.id("u_0_r"));
      if (submitbutton.isEnabled())
      {
      submitbutton.click();
      }
      Thread.sleep(5000);
  }
  
  @Test
  public void google() throws InterruptedException {
         driver.navigate().to("https://www.google.co.in/");
         WebElement searchbar = driver.findElement(By.id("lst-ib"));
         WebElement googlesubmit = driver.findElement(By.id("_fZl"));
         if (searchbar.isEnabled())
         {
                searchbar.click();
                searchbar.sendKeys("Tri Strontium Phosphate");
                googlesubmit.click();
         }
         Thread.sleep(5000);
         List<WebElement> alllinks = driver.findElements(By.tagName("a"));
         for (WebElement eachlink : alllinks ){
                System.out.println(eachlink.getText());
                if(eachlink.getText().contains("Strontium Phosphate | AMERICAN ELEMENTS")){
                       eachlink.click();
                       Thread.sleep(5000);
                }
         }
  }
  
  @BeforeMethod
  public void beforeMethod() {
         driver = new ChromeDriver();
      
      
  }

  @AfterMethod
  public void afterMethod() {
         driver.quit();
  }

}


