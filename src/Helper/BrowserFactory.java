package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage;

public abstract class BrowserFactory {
public 	static WebDriver driver;

public BrowserFactory(WebDriver driver){
BrowserFactory.driver = driver;
  
}
	
public static WebDriver startbrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Pageobject\\Browser\\chromedriver.exe");
		
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
