package BrowserBasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvoation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
   
   WebDriver driver=new ChromeDriver();
   
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();

  driver.get("https://www.cs-cart.com/");

  String s=driver.getTitle();
  System.out.println("Current page title is : " +s);
  
  String url=driver.getCurrentUrl();
  System.out.println("Current URL is : " +url);
  
  if(s.equals("CS-Cart Multi-Vendor Marketplace Platform & Shopping Cart Software – Professional Ecommerce Tools"))
  {
	  System.out.println("Page Title is Correct");
  }	  
  else
  {
	  System.out.println("Page Title is Wrong");
  }
  driver.quit();
 }
}
