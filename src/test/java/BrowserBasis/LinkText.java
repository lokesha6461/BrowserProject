package BrowserBasis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver",System.getProperty("user.dir") +"/chromedriver.dir" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
		
		WebElement lokesha=driver.findElement(By.linkText("ID locator in Selenium"));
				
		Thread.sleep(3000);
		
		lokesha.click();
		Thread.sleep(4000);
		
	}

}
