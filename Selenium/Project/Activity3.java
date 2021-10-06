
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

public class Activity3 {
WebDriver driver;

@BeforeMethod
public void beforeclass()
{
	  WebDriver driver = new FirefoxDriver();
}
@Test
public void login()
{
	

	   WebDriver driver = new FirefoxDriver();
    driver.get("http://alchemy.hguy.co/orangehrm");
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	 String Actualtitle1 =driver.getTitle();
	 System.out.println(Actualtitle1);
	  String Expectedtitle1 ="OrangeHRM";
	  Assert.assertEquals(Expectedtitle1,  Actualtitle1);
	  driver.close();
	
	
} 



@AfterMethod
public void aftertest()
{
	 driver.close();
}
}