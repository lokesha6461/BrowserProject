package BrowserBasis;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaInvocation {

	public static void main(String[] args)
	{
	 System.setProperty("WebDriver.Opera.driver", System.getProperty("user.dir")+ "/operadriver.exe");
	 
	 WebDriver driver = new OperaDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	   
	 driver.get("https://www.google.com/");

	  String s=driver.getTitle();
	  System.out.println("Current page title is : " +s);
	  
	  String url=driver.getCurrentUrl();
	  System.out.println("Current URL is : " +url);
	  
	  String Title ="Googlee";
	  
	  if(s.equals(Title))
	  {
		  System.out.println("Page Title is Correct");
	  }	  
	  else
	  {
		  System.out.println("Page Title is Wrong");
	  }
      
	}

}
