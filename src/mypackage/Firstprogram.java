package mypackage;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstprogram {
WebDriver driver;

@Test
public void Integritydatalogin() throws InterruptedException, MalformedURLException

{

 System.setProperty("webdriver.gecko.driver", "C://Program Files (x86)//geckodriver.exe");
driver = new FirefoxDriver();
 System.out.println("*************************");	
 driver.manage().window().maximize();
 System.out.println("*************************");	
 driver.get("http://www.gmail.com");
 Thread.sleep(3000);
/*WebElement login= driver.findElement(By.xpath(".//*[@id='Google']"));
login.click();
Thread.sleep(1000);
WebElement email1=new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Email']")));
email1.click();
email1.sendKeys("staging2testing06@gmail.com");
WebElement next=new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='next']")));
next.click();
WebElement pass=new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Passwd']")));
pass.click();
pass.sendKeys("staging@2016testing");
Thread.sleep(10000);
driver.findElement(By.xpath(".//*[@id='signIn']")).click();
Thread.sleep(10000);
String title2=driver.getTitle();
System.out.println("Title :  "+title2 );
String title1="Dashboard - Integrity Data Cloud Services";
System.out.println("*************************");	
AssertJUnit.assertEquals(title1,title2);
System.out.println("*************************");	
driver.findElement(By.xpath(".//*[@id='sidebar']/div/ul/li[2]/a")).click();
driver.findElement(By.xpath(".//*[@id='divLogInContext']/div/div/div[1]/div/div/div[2]/h2/a")).click();
Actions action = new Actions(driver);
System.out.println("*************************");
WebElement reports = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='sidebar']/div/ul/li[2]/a/span[1]")));
System.out.println("*************************");	
reports.click();
System.out.println("*************************");	
Thread.sleep(10000);*/
driver.quit();
}
}