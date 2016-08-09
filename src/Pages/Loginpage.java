package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;

public class Loginpage extends BrowserFactory  {
	
	public Loginpage(WebDriver driver)
	{
	super(driver);
	}
	
	 @FindBy(how=How.XPATH,using=".//*[@id='signin_info']/a[1]")

	 public WebElement link_click;

	  @FindBy(how=How.XPATH,using=".//*[@id='login1']")
		
	 public WebElement link_click2;
	  
	  @FindBy(how=How.XPATH,using=".//*[@id='password']")
		
	 public WebElement link_click3;
	  
	  @FindBy(how=How.XPATH,using="html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")
		 
	  public WebElement link_click4;
	  
	  @FindBy(how=How.XPATH,using="//*[@id='userName']")
		
	  public WebElement link_click5;
	   
	  @FindBy(how=How.XPATH,using="//*[@id='signOut']")
		
	  public WebElement link_click6;
	  
	 
	  
	  public Inboxpage loginrediff(String username ,String password) throws InterruptedException
	  {
		  link_click.click();
			
			//Enter UserName
			link_click2.sendKeys(username);
			
			//Enter Password
			link_click3.sendKeys(password);
	  			
			//Click Login Button
			link_click4.click();
			
			System.out.println("B");
			Thread.sleep(50000);
	     
			System.out.println(driver.getCurrentUrl());
			
			return PageFactory.initElements(driver, Inboxpage.class);

				
	  }
	  public Inboxpage loginrediff(String username) throws InterruptedException
	  {
		  link_click.click();
			
			//Enter UserName
			link_click2.sendKeys(username);
			
			//Enter Password
			link_click3.sendKeys("rediff@1983");
	  			
			//Click Login Button
			link_click4.click();
			
			System.out.println("B");
			Thread.sleep(50000);
	     
			System.out.println(driver.getCurrentUrl());
			
			return PageFactory.initElements(driver, Inboxpage.class);
	  }
	  }
	   


