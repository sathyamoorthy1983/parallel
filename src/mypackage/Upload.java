package mypackage;

import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class  Upload {
    WebDriver driver;

	@BeforeTest
    public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver",	"C:\\Users\\sathyamoorthyp\\workspace\\Selenium First Program\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    //driver = new InternetExplorerDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       }
    @Test
    public void uploadFile() throws Exception {
        String filePath =  System.getProperty("user.dir") + "\\src\\drivers\\ somt-file.txt.txt";
             
        System.out.println("path:" +filePath);
        driver.get("http://the-internet.herokuapp.com/upload");
       // driver.manage().window().setPosition(new Point(2000, 0));
        System.out.println("*************************");	
        //driver.findElement(By.xpath(".//*[@id='file-upload']")).sendKeys(filePath);
        driver.findElement(By.xpath(".//*[@id='file-upload']")).click();
        System.out.println("*************************");	
        Runtime.getRuntime().exec("D:\\autoit");
        //driver.findElement(By.xpath(".//*[@id='file-submit']")).click();
        System.out.println("*************************");
        driver.manage().window().maximize(); 
        Thread.sleep(1000);

    }
    @Test(enabled=false) 
    public void webtable() 
    {
    	 
    driver.get("http://www.icicibank.com/interest-rates.page");
       
      try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
       WebElement savingsaccount=driver.findElement(By.xpath(".//*[@id='expand-all0']/div[1]/h2/span"));
      savingsaccount.click();
      
      //number of rows
      List<WebElement> rows = driver.findElements(By.xpath("//*[@id='expand-all0']/div[1]/div[1]/div[1]/div[1]/table/tbody/tr"));
      System.out.println("rows:" + rows.size());
      
      //number of columns
      List<WebElement> col=driver.findElements(By.xpath("//*[@id='expand-all0']/div[1]/div[1]/div[1]/div[1]/table/thead/tr[1]/th"));
      System.out.println("rows:" + col.size());
      
      //get all the column value in a table
      for(int j=0;j<=col.size()-1;j++) 
      {
          System.out.println(col.get(j).getText());
      }
      
      //get all the cell data in a table
      for(int i=1;i<=rows.size()-1;i++)
      {
          List<WebElement> Cells = rows.get(i).findElements(By.tagName("td"));
          for (WebElement cell : Cells)
          {
              System.out.println( cell.getText()  ); 
          }
              
      }
    }
   @Test
    public void checkboxandradiobutton(){
    	
    	// Launch the URL
    	driver.get("http://toolsqa.com/automation-practice-form");

    	// Step 3 : Select the de selected Radio button (female) for category Sex (Use IsSelected method)

    	// Storing all the elements under category 'Sex' in the list of WebLements 
    	List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));

    	// Create a boolean variable which will hold the value (True/False)
    	boolean bValue = false;


    	// This statement will return True, in case of first Radio button is selected
    	bValue = rdBtn_Sex.get(0).isSelected();

    	// This will check that if the bValue is True means if the first radio button is selected
    	if(bValue == true){


    	// This will select Second radio button, if the first radio button is selected by default
    	rdBtn_Sex.get(1).click();

    	}
    	else
    	{

    	// If the first radio button is not selected by default, the first will be selected
    	rdBtn_Sex.get(0).click();

    	}

    	//Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
    	WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));

    	rdBtn_Exp.click();

    	// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)


    	// Find the Check Box or radio button element by Name
    	List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));

    	// This will tell you the number of Check Boxes are present
    	int iSize = chkBx_Profession.size();

    	// Start the loop from first Check Box to last Check Box
    	for(int i=0; i < iSize ; i++ )
    	{

    	// Store the Check Box name to the string variable, using 'Value' attribute
    	String sValue = chkBx_Profession.get(i).getAttribute("value");
    	
    	// Select the Check Box it the value of the Check Box is same what you are looking for
    	if (sValue.equalsIgnoreCase("Automation Tester")){

    	chkBx_Profession.get(i).click();
    	// This will take the execution out of for loop

    	break;
    	}
    	}
   }
        
    
@AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}
