package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Data.Xls_Reader;

public class BaseTest
{
	
	//public static WebDriver driver;
	//public static EventFiringWebDriver driver;
	public static Xls_Reader reader = new Xls_Reader("C:\\Program Files\\Java\\Pageobject\\Suite1.xlsx");
	public static Properties OR;
	
	
	
	
	
}


