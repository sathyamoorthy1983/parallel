package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.BrowserFactory;

public class Address extends BrowserFactory {

	 public Address(WebDriver driver)
		{
		super(driver);
						}

	@FindBy(how=How.XPATH,using=".//*[@id='mail_main_box_cont']/div[2]/div[2]/div/div/ul/li[2]/a")
		 public static WebElement linkaddress;
		


public void cc() throws InterruptedException
{
linkaddress.click();
Thread.sleep(6000);

}

}