package tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Assume;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Helper.BrowserFactory;
import Pages.Inboxpage;
import Pages.Loginpage;
import Utils.Excel;
import Utils.TestUtils;


public class LoginTest extends BrowserFactory {
		
	public LoginTest(WebDriver driver)
	{
	super(driver);
	}
	
	//WebDriver driver=new FirefoxDriver();
//SoftAssert a=new SoftAssert();
	 
	@DataProvider
	public static  Object[][]  readData() 
	{
		 Excel abc=new TestUtils();
		if(abc.IsSkipped("LoginTest"))
		{
			Assert.assertTrue(false);
		
		
		}
		
		return abc.readTestData("LoginTest");
	}
	 

@Test(dataProvider ="readData",groups="Smoke")
public static Inboxpage checkvaliduser(String username,String password) throws InterruptedException
{

WebDriver driver= BrowserFactory.startbrowser("chrome", "http://www.rediff.com/");

Loginpage Login1=PageFactory.initElements(driver, Loginpage.class);

Inboxpage inbox=Login1.loginrediff(username,password);
Assert.assertEquals(driver.getTitle(), "Rediffmail","not matching");

System.out.println(driver.getCurrentUrl());
Assert.assertTrue(true);


return inbox;

	
	
}
	 }