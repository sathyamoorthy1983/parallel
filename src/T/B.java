
package T;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class B {

	@Test
	public static void click_login() throws MalformedURLException
	{
	
		
		System.setProperty("webdriver.ie.driver", "D://seleniumwork//Testing//Browser//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
     //WebDriver driver=new FirefoxDriver();
	  driver.get("http://amazon.co.in");
	  driver.close();
	}

	  

}
