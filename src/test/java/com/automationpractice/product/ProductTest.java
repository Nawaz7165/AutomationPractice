package com.automationpractice.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;

public class ProductTest extends TestBase{
	@Test
	public void review_on_product() {
		
		UI ui= new UI(driver);
		
		
//		    Go to http://www.automationpractice.com
		    ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		    ui.click(By.xpath("//a[@class='login']"));
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		    ui.sendKeys(By.xpath("//input[@id='email']"), "sarah2310@ymail.com");
//			Enter valid password 'abc1234' in password text field
		    ui.sendKeys(By.xpath("//input[@id='passwd']"), "abc1234");
//			Click 'Sign in' button
		   ui.webDriverWaitUntilClickable(By.xpath("//button[@id='SubmitLogin']"));
//			Go to http://automationpractice.com/index.php?id_product=7&controller=product
		    ui.navigateTo("http://automationpractice.com/index.php?id_product=7&controller=product");
		    
//			Click on Write a review
		    WebDriverWait wait= new WebDriverWait(driver,45);
	    	 WebElement vel=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product_comments_block_extra > ul > li > a\"),\"Write a review")));
	    	 vel.click();
//		    ui.webDriverWaitUntilTextToBePresent(By.cssSelector("#product_comments_block_extra > ul > li > a"),"Write a review");    
//		    		ui.click(By.cssSelector("#product_comments_block_extra > ul > li > a"));
//			Click Send button without typing anything
		    ui.click(By.xpath("//button[@id='submitNewMessage']"));
//			Verify 'Title is incorrect' text displayed
		    ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'Title is incorrect')]"), "Title is incorrect");
//			Verify 'Comment is incorrect' text displayed
//			Enter 'Awesome dress' in title
//			Enter 'Best purchase ever!!!' in Comment
//			Click Send button
//			Verify 'Your comment has been added and will be available once approved by a moderator' text displayed in popup
//			Click OK
//			Verify 'write a review' button gets appeared after few seconds. You may need to refresh the page until the button gets appear

		
		
		
	}
	

}
