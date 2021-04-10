package BrowserBasis;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.driver", System.getProperty("user.dir") +"/chromedriver.dir");
  
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
	
	WebElement Lokesha=driver.findElement(By.partialLinkText("ID locator"));
	
	Thread.sleep(2000);
	
	Lokesha.click();
	
	Thread.sleep(2000);	
	
}

}
