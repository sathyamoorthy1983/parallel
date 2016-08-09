package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Helper.BrowserFactory;
import tests.LoginTest;
import Pages.Address;
import Pages.Loginpage;
import Pages.Inboxpage;
import Utils.TestUtils;

public class InboxTest extends BrowserFactory
{	
	public InboxTest(WebDriver driver)
	{
		super(driver);
		
	}
	@DataProvider
	public static Object[][] dd()
	{
		return LoginTest.readData();
		
	}

	@Test(dataProvider ="dd",groups="Regression")
	public static Address click(String username,String password) throws InterruptedException
	{
		Inboxpage in=LoginTest.checkvaliduser(username,password);
	    Address ad=	in.mailclick();
	    Assert.assertTrue(true);
		return ad;
	
	}
}