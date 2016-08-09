package tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import Pages.Address;
import Pages.Inboxpage;

public class AddressTest extends BrowserFactory  {
	
	public AddressTest(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
	}
	@DataProvider
	public static Object[][] ddd()
	{
		return LoginTest.readData();
		
	}

		
	@Test(dataProvider ="ddd")
	public static void mm(String username, String password) throws InterruptedException
	{
		Logger log = Logger.getLogger("logvalue");

InboxTest ii=PageFactory.initElements(driver, InboxTest.class);
log.debug("ii");
Address add=InboxTest.click(username,password);
add.cc();
Assert.assertTrue(true);
}
}