package base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import dataprovider.ConfigReader;
import factory.BrowserFactory;

public class BaseClass 
{
	
	public WebDriver driver;
	@BeforeClass
	public void setupBrowser()
	{
		System.out.println("LOG:INFO-Setting Up Browser");
		driver=BrowserFactory.getDriver(ConfigReader.getValue("browser"), ConfigReader.getValue("qaenv"));
		System.out.println("LOG:INFO-Application is up and running");
	
	}
	
	@AfterClass
	public void teardDown()
	{
	  System.out.println("LOG:INFO-Closing Browser");
	  driver.quit();
	  System.out.println("LOG:INFO-Application and browser closed");
	}

}
