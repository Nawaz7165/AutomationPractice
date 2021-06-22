package com.automationpractice.profile;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;

public class ProfileTest extends TestBase{
	
	
	@Test
	public void Update_name_in_User_Profile() {
		
		UI ui= new UI(driver);
//		    Go to http://www.automationpractice.com
				ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		        ui.click(By.className("login"));
//			Enter valid email address 'sarah2310@ymail.com' in email address text field of right side
		        ui.sendKeys(By.id("email"), "sarah2310@ymail.com");
//			Enter valid password 'abc1234' in password text field
		        ui.sendKeys(By.id("passwd"), "abc1234");
//			Click 'Sign in' button
		        ui.actions(By.id("SubmitLogin"));
//			Click on name 'Nawaz Ahmed' from top right corner
		        ui.click(By.xpath("//a[@class='account']"));
//			Click on button 'MY PERSONAL INFORMATION'
		        ui.click(By.xpath("//span[contains(text(),'My personal information')]"));
//			Verify text displayed 'Please be sure to update your personal information if it has changed.'
		        ui.getTextFromElementAndVarify(By.className("info-title"), "Please be sure to update your personal information if it has changed.");
//			Enter new first name as 'Hanif'
		        ui.clear(By.id("firstname"));
		        ui.sendKeys(By.id("firstname"), "Hanif");
//			Enter new last name as 'Shanket'
		        ui.clear(By.id("lastname"));
		        ui.sendKeys(By.id("lastname"), "Shanket");
//			Click 'Save' button
		        ui.click(By.name("submitIdentity"));
//			Verify error message displayed 'There is 1 error'
		        ui.getTextFromElementAndVarify(By.xpath("//p[contains(text(),'There is 1 error')]"), "There is 1 error");
//			Verify error message displayed 'The password you entered is incorrect'
		        ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'The password you entered is incorrect.')]"), "The password you entered is incorrect.");
//			Enter current password 'abc1234' in password text field
		        ui.sendKeys(By.id("old_passwd"), "abc1234");
//			Click 'Save' button
		        ui.click(By.xpath("//button[@name='submitIdentity']"));
//			Verify success message displayed 'Your personal information has been successfully updated.'
		        ui.getTextFromElementAndVarify(By.xpath("//p[@class='alert alert-success']"), "Your personal information has been successfully updated.");
//			Click on name 'Hanif Shanket' from top right corner
		        ui.click(By.xpath("//a[@class='account']"));
//			Click on button 'MY PERSONAL INFORMATION'
		        ui.click(By.xpath("//span[contains(text(),'My personal information')]"));
//			Verify text displayed 'Please be sure to update your personal information if it has changed.'
		        ui.getTextFromElementAndVarify(By.xpath("//p[@class='info-title']"), "Please be sure to update your personal information if it has changed.");
//			Enter first name back as 'Misir'
		        ui.clear(By.id("firstname"));
		        ui.sendKeys(By.id("firstname"), "Nawaz");
//			Enter last name back as 'Ali'
		        ui.clear(By.id("lastname"));
		        ui.sendKeys(By.id("lastname"), "Ahmed");
//			Enter current password 'abc1234' in password text field
		        ui.sendKeys(By.id("old_passwd"), "abc1234");
//			Click 'Save' button
		        ui.click(By.xpath("//button[@name='submitIdentity']"));
//			Verify success message displayed 'Your personal information has been successfully updated.'
		        ui.getTextFromElementAndVarify(By.xpath("//p[@class='alert alert-success']"), "Your personal information has been successfully updated.");
		
	}
	@Test
	public void change_password() {
		
		UI ui= new UI(driver);
		
//          Go to http://www.automationpractice.com
		       ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		       ui.click(By.className("login"));
//		    Enter valid email address 'sarah2310@ymail.com' in email address text field of right side
		       ui.sendKeys(By.id("email"), "sarah2310@ymail.com");
//			Enter valid password 'abc1234' in password text field
		       ui.sendKeys(By.id("passwd"), "abc1234");
//			Click 'Sign in' button
		       ui.actions(By.id("SubmitLogin"));
//			Click on name 'Nawaz Ahmed' from top right corner
		       ui.click(By.xpath("//a[@class='account']"));
//	    	Click on button 'MY PERSONAL INFORMATION'
		       ui.click(By.xpath("//span[contains(text(),'My personal information')]"));
//			Enter current password as 'abc1234'
		       ui.sendKeys(By.xpath("//input[@id='old_passwd']"), "abc1234");
//			Enter new password as 'xyz1234' in new password text field
		       ui.sendKeys(By.xpath("//input[@id='passwd']"), "xyz1234");
//			Click 'Save' button
		       ui.click(By.xpath("//button[@name='submitIdentity']"));
//			Verify error message displayed 'There is 1 error'
		       ui.getTextFromElementAndVarify(By.xpath("//p[contains(text(),'There is 1 error')]"), "There is 1 error");
//			Verify error message displayed 'The password and confirmation do not match.'
		       ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'The password and confirmation do not match.')]"), "The password and confirmation do not match.");
//		    Enter old password as 'abc1234' in oldpassword field
		       ui.sendKeys(By.xpath("//input[@id='old_passwd']"), "abc1234");
//			Enter new password as 'xyz1234' in new password text field
		       ui.sendKeys(By.xpath("//input[@id='passwd']"), "xyz1234");
//			Enter same password 'xyz1234' in confirmation text field
		       ui.sendKeys(By.xpath("//input[@id='confirmation']"), "xyz1234");
//			Click 'Save' button
		       ui.click(By.xpath("//button[@name='submitIdentity']"));
//			Verify success message displayed 'Your personal information has been successfully updated.
			   ui.getTextFromElementAndVarify(By.xpath("//p[@class='alert alert-success']"), "Your personal information has been successfully updated.");
//			Click on name 'Nawaz Ahmed' from top right corner
			   ui.click(By.xpath("//a[@class='account']"));
//			Click on button 'MY PERSONAL INFORMATION'
			   ui.click(By.xpath("//span[contains(text(),'My personal information')]"));
//			Enter current password as 'xyz1234'
			   ui.sendKeys(By.xpath("//input[@id='old_passwd']"), "xyz1234");
//			Enter new password as 'abc1234' in new password text field
			   ui.sendKeys(By.xpath("//input[@id='passwd']"), "abc1234");
//			Enter same password 'abc1234' in confirmation text field
			   ui.sendKeys(By.xpath("//input[@id='confirmation']"), "abc1234");
//			Click 'Save' button
			   ui.click(By.xpath("//button[@name='submitIdentity']"));
//			Verify success message displayed 'Your personal information has been successfully updated.'
			   ui.getTextFromElementAndVarify(By.xpath("//p[@class='alert alert-success']"), "Your personal information has been successfully updated.");
	
	}
	
	@Test
	public void Create_And_Delete_Wish_List() {
		
		// String Name="My Winter Shopping";
	    //  String Qty="0";
	      //String Viewed="0";
	    ///  String DirectLink="View";
	      
	      //MonthDay month=MonthDay.now();
	     // LocalDate cd=month.atYear(2021);
	      
		
		      UI ui= new UI(driver);

//		    Go to http://www.automationpractice.com
		     ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		     ui.click(By.className("login"));
//			Enter valid email address 'sarah2310@ymail.com' in email address text field of right side
		     ui.sendKeys(By.id("email"), "sarah2310@ymail.com");
//			Enter valid password 'abc1234' in password text field
		     ui.sendKeys(By.id("passwd"), "abc1234");
//			Click 'Sign in' button
		     ui.actions(By.xpath("//button[@id='SubmitLogin']"));
//			Click MY WISH LISTS button
		     ui.click(By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a > span"));
//			Enter 'My Winter Shopping' in name test field
		     ui.sendKeys(By.xpath("//input[@id='name']"), "My Winter Shopping");
//			Click Save button
		     ui.actions(By.xpath("//button[@id='submitWishlist']"));
//			Verify new wish list created with name = 'My Winter Shopping', Qty=0, Viewed=0, Created=today's date, Direct Link = View
		  //  List<WebElement>table_head=driver.findElements(By.xpath("//table[@class='table table-bordered']/thead/tr/th"));
		    // for(WebElement e:table_head) {
		    	 		    	 //}
		  // List<WebElement>table_body=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td"));
		    // WebElement e1=table_body.get(1);
		     //if(e1.getText().equalsIgnoreCase("My Winter Shopping")) {
		    //	 System.out.println("pass");
		    // }
			//   for(WebElement e1:table_body) {
		    // System.out.println(e1.getText());
		    	
		   
//			Delete the created wish list item
		     ui.click(By.xpath("//i[@class='icon-remove']"));
//			Click OK from the alert popup
		     ui.switchToAllert_accept();
//			Verify wishlist item is removed
		    ui.webDriverWaitUntilInvisible(By.xpath("//div[@id='block-history']"));

		
	}}


