package Selenium.Selenium;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeclass()
	{
		  WebDriver driver = new FirefoxDriver();
	}
	@Test
		public void Verifytitle() throws InterruptedException
		{
		 WebDriver driver = new FirefoxDriver();
		 
			    
			//  Thread.sleep(100);
               driver.get("http://alchemy.hguy.co/orangehrm");
			   String Actualtitle =driver.getTitle();
			   System.out.println(Actualtitle);
			   String Expectedtitle ="OrangeHRM";
			   Assert.assertEquals(Expectedtitle,  Actualtitle);
			  

}
	@AfterMethod
	public void aftertest()
	{
		 driver.close();
	}
}
