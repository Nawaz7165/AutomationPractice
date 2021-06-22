package com.automationpractice.misc;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;

public class DriverSwitch extends TestBase {
	
	@Test
	public void handlingAllert() {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}

}
