package BrowserBasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver",System.getProperty("use.dir") + "/geckodriver.exe");
		   
		   WebDriver driver=new FirefoxDriver();
		   
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
		  //driver.quit();
	}

}
