package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;
public class Inboxpage extends BrowserFactory {
	
 public Inboxpage(WebDriver driver)
	{
	super(driver);
	}

@FindBy(how=How.XPATH,using=".//*[@id='1467199118_S_6161_administrator_mail_welcomerediffmail_12345_rediffmail_com']/span[1]")
 public static WebElement linkclick1;
	
	public Address mailclick() throws InterruptedException
	{
		linkclick1.click();
		Thread.sleep(7000);

		return PageFactory.initElements(driver, Address.class);
	}




}
