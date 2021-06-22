package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class Scholastica extends TestBase{
	
	
	@Test
	public void siginIn() {
		driver.get("https://clubs3qa1.scholastic.com/home");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.switchTo().frame("iframeMyScholastic");
		driver.findElement(By.xpath("//input[contains(@class,'EmailField_')]")).sendKeys("abc@yahoo.com");
		
		WebElement e=driver.findElement(By.id("signin-email-submit-button"));
		
		WebDriverWait wait= new WebDriverWait(driver,45);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		e.click();
	}

}
