package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helper.Utility;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By username=By.id("email1");
	private By password=By.name("password1");
	private By loginButton=By.className("submit-btn");
	
	public HomePage loginToApp(String uname,String pass)
	{
		//driver.findElement(username).sendKeys(uname);
		//driver.findElement(password).sendKeys(pass);
		//driver.findElement(loginButton).click();

		Utility.findElement(driver, username).sendKeys(uname);
		Utility.findElement(driver, password).sendKeys(pass);
		Utility.clickElement(driver, loginButton);
		
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		return home;
		
	}

}
