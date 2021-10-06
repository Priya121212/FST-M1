package Selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity8 {
	
	@Test
	public void addqualificatio() throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	 
    
	//  Thread.sleep(100);
       driver.get("http://alchemy.hguy.co/orangehrm");
	   String Actualtitle =driver.getTitle();
	   System.out.println(Actualtitle);
	   String Expectedtitle ="OrangeHRM";
	   Assert.assertEquals(Expectedtitle,  Actualtitle);
	   driver.findElement(By.id("txtUsername")).sendKeys("orange");
       driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
   	   driver.findElement(By.id("btnLogin")).click();
   	   Thread.sleep(10000);
   	   driver.findElement(By.id("menu_pim_viewMyDetails")).click();
   	   Thread.sleep(5000);
   	   driver.findElement(By.xpath("//a[contains(text(), 'applyLeave')]")).click();
   	Select applyleave_txtLeaveTyp = new Select(driver.findElement(By.id("applyleave_txtLeaveTyp")));
   	applyleave_txtLeaveTyp.selectByVisibleText("privilege leaves");
   driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("09102021");
    driver.findElement(By.id("applyleave_txtToDate")).sendKeys("10102021");
    driver.findElement(By.id("applyBtn")).click();
    driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
  
   
   	
 
	   
	}
}
