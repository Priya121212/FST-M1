
package Selenium.Selenium;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Activity7 {
WebDriver driver;

@BeforeMethod
public void beforeclass()
{
	  WebDriver driver = new FirefoxDriver();
}

@Test
public void Dashboard() throws InterruptedException
{  WebDriver driver = new FirefoxDriver();
 driver.get("http://alchemy.hguy.co/orangehrm");
 driver.findElement(By.id("txtUsername")).sendKeys("orange");
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
 driver.findElement(By.id("menu_pim_viewPimModule")).click();
driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
driver.findElement(By.id("btnAdd")).click();
driver.findElement(By.id("firstName")).sendKeys("Priyanka");
driver.findElement(By.id("lastName")).sendKeys("Hole");

driver.findElement(By.id("chkLogin")).click();

driver.findElement(By.id("user_name")).sendKeys("Priyankahole8082@");

Select status= new Select(driver.findElement(By.id("status")));
status.selectByVisibleText("Enabled");
status.selectByIndex(1);
//Thread.sleep(1233);

driver.findElement(By.id("btnSave")).click();

driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Sonali");
	driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Bhujabal");
	driver.findElement(By.id("firstName")).sendKeys("Priyanka");
	Select personal_cmbNation = new Select(driver.findElement(By.id("personal_cmbNation")));
personal_cmbNation.selectByVisibleText("India");
personal_cmbNation.selectByIndex(80);
Thread.sleep(122);
driver.findElement(By.id("btnSave")).click();
driver.findElement(By.id("personal_optGender_2")).click();
driver.findElement(By.id("btnSave")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,250)", "");
driver.findElement(By.xpath("//*[contains(text(),'Qualifications')]'")).click();
driver.findElement(By.id("addWorkExperience")).click();
driver.findElement(By.id("experience_employer")).sendKeys("IBM");
driver.findElement(By.id("experience_jobtitle")).sendKeys("Testing");
driver.findElement(By.id("btnWorkExpSave")).click();



}



	
	



@AfterMethod
public void aftertest()
{
	 driver.close();
}
}