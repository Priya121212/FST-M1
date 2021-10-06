
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

public class Activity2 {
WebDriver driver;

@BeforeMethod
public void beforeclass()
{
	  WebDriver driver = new FirefoxDriver();
}
@Test
public void verifyheadertitle()
{
	  
	   WebDriver driver = new FirefoxDriver();
       driver.get("http://alchemy.hguy.co/orangehrm");
      
     String url = driver.findElement(By.xpath("//div[contains text(), 'orangehrm']")).getAttribute("src");
     System.out.println(url);
}     



@AfterMethod
public void aftertest()
{
	 driver.close();
}
}