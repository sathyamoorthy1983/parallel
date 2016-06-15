
package T;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class B {

	@Test
	public static void click_login() throws MalformedURLException
	{
	/*public static String baseurl="http://www.ebay.in/ ";
	public static String nodeurl="http://192.168.28.1:5566/wd/hub";*/
		
		System.setProperty("webdriver.chrome.driver", "D://workspace//Testing//Browser//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     //WebDriver driver=new FirefoxDriver();
	  driver.get("http://gmail.com");
	  driver.close();
	}

	  
/*@BeforeTest
public void setup() throws MalformedURLException, InterruptedException
{
	

  driver=new FirefoxDriver();
  driver.get("http://gmail.com");

}*/
	//driver=new ChromeDriver();

/*@Test
public static void click_login() throws MalformedURLException
{
	
	//driver.get(baseurl);
	driver.manage().window().maximize();
	WebElement ebayloginclick=driver.findElement(By.xpath(".//*[@id='gh-ug']/a"));
	ebayloginclick.click();
	
}*/

	
		
	/*@AfterTest
	public void endsession()
	{
		
		driver.quit();
	}*/
}
