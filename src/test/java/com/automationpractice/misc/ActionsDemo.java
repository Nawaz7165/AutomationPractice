package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class ActionsDemo extends TestBase {

	@Test
	public void keysToEnter() {
		
		driver.get("http://automationpractice.com/index.php?");
	WebElement e=  driver.findElement(By.id("search_query_top"));
	  
	 Actions action= new Actions(driver);
	 
	action.moveToElement(e).sendKeys(e, "invalid").sendKeys(Keys.ENTER).build().perform();
	
		}
	@Test
	public void dragAndDrop() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Actions actions=new Actions(driver);
		WebElement s=driver.findElement(By.id("drag"));
		WebElement t=driver.findElement(By.id("drop"));
		
		actions.dragAndDrop(s, t).build().perform();
		
	}
	@Test
	public void mouseOver() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions actions= new Actions(driver);
		
		WebElement r=driver.findElement(By.xpath("//li[contains(@onmouseover,'Red means danger')]"));
		actions.moveToElement(r).build().perform();
		
		}
@Test
public void enterByAction() {
	
	driver.get("http://automationpractice.com/index.php?");
	WebElement i=driver.findElement(By.id("search_query_top"));
	i.sendKeys("invalid");
	
	Actions actions=new Actions(driver);
	actions.moveToElement(i).sendKeys(i, Keys.ENTER).build().perform();
	
	
}
}
