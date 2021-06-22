package com.automationpractice.login;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests extends TestBase{
	
	//
	
	@Test
	public void Login_with_invalid_userid() {
		
		UI ui= new UI(driver);
		
//		    Go to http://www.automationpractice.com
		ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		ui.click(By.className("login"));
//	        Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		ui.sendKeys(By.id("email") ,"myunknowxaad@mailinator.com");
//			Click Sign in button
		ui.actions(By.id("SubmitLogin"));
//	        Verify error message displayed 'There is 1 error'
		ui.getTextFromElement(By.className("page-subheading"));
//			Verify error message displayed 'Password is required.'
		ui.getTextFromElement(By.xpath("//li[contains(text(),'Password is required.')]"));
	}
	
	@Test
	public void Login_with_valid_userid_but_invalid_password() {
		
		UI ui= new UI(driver);
		
//		    Go to http://www.automationpractice.com
		ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		ui.click(By.className("login"));
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		ui.sendKeys(By.id("email"),"abc213@mailinator.com");
//	        Enter invalid password 'myinvalidpwd' in password text field
		ui.sendKeys(By.id("passwd"),"myinvalidpwd");
//			Click 'Sign in' button
		ui.actions(By.xpath("//p[@class='submit']//span[1]"));
//		    Verify error message displayed 'There is 1 error'
		ui.getTextFromElementAndVarify(By.xpath("//p[contains(text(),'There is 1 error')]"), "There is 1 error");
//         Verify error message displayed 'Authentication failed.'
	    ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'Authentication failed.')]"),"Authentication failed.");
	
	
//		WebDriverWait wait= new WebDriverWait(driver,45);
//  		wait.until(ExpectedConditions.elementToBeClickable(e));
//      		e.click();
		
//		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0]. click();", e);

	}
	
	@Test
	public void Login_with_valid_userid_and_password() {
		
		UI ui= new UI(driver);
		
//		      Go to http://www.automationpractice.com
		ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		ui.click(By.className("login"));
//			Enter valid email address 'sarah2310@ymail.com' in email address text field of right side
		ui.sendKeys(By.id("email"),"sarah2310@ymail.com");
//			Enter valid password 'abc1234' in password text field
		ui.sendKeys(By.id("passwd"),"abc1234");
//			Click 'Sign in' button
		ui.actions(By.xpath("//p[@class='submit']//span[1]"));
//			Verify 'MY ACCOUNT' text displayed
		ui.getTextFromElementAndVarify(By.className("page-heading"),"MY ACCOUNT");
		
//	       Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		ui.getTextFromElementAndVarify(By.className("info-account"),"Welcome to your account. Here you can manage all of your personal information and orders.");
		
//		   Verify 'MY PERSONAL INFORMATION' text displayed
		ui.getTextFromElementAndVarify(By.xpath("//span[contains(text(),'My personal information')]"),"MY PERSONAL INFORMATION");
		
//			Click 'Sign out' button from top right corner
		ui.click(By.className("logout"));
		
	}
	


}