package com.automationpractice.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UI {
	
	private WebDriver d;
	
	public UI(WebDriver driver) {
		d=driver;
	}
     public void openUrl(String url) {
    	 d.get(url);
         }
     // CLICKS:
     public void click(By locator) {
    	 d.findElement(locator).click();
     }
     // SendKeys:
     public void sendKeys(By locator, String text) {
    		 d.findElement(locator).sendKeys(text);
    	 }
     // Actions For Clicks:
         public void actions(By locator) {
    		 WebElement e=d.findElement(locator);
    		 Actions actions = new Actions(d);
 			actions.moveToElement(e).click().build().perform();
    		     	 }
     // Switch For Allert
         
         public void switchToAllert_accept() {
        	d.switchTo().alert().accept();
        	 }
         public void switchToAllert_dismiss() {
         	d.switchTo().alert().dismiss();
         }
         
     // Get Text:
         
         public  String getTextFromElement(By locator) {
        	 
        	 String text=null;
        	 
        	 text=d.findElement(locator).getText();
        	 return text;
        	
         }
       
           // Verification:
         
    	     public String getTextFromElementAndVarify(By locator, String expected) {
    		 
    	    	 String text=null;
    		
				text=d.findElement(locator).getText();
				Assert.assertEquals(text, expected);
				return text;
			 
			}
    	     
    	     public String getAttributeValue(By locator, String text ) {
    	    	 String val;
    	    	  val=d.findElement(locator).getAttribute(text);
    	    	  return val;
    	    	  
    	     }
    	    
    	     public boolean isDispalyed(By locator) {
    	    	 boolean isDisplayed=d.findElement(locator).isDisplayed();
    	    	 return true;
    	     }
    	     
    	     // CLEAR:
    	     public void clear(By locator) {
    	    	 d.findElement(locator).clear();
    	     }
    	     
    	     //Wait:
    	     public void webDriverWaitUntilInvisible(By locator) {
    	    	 
    	    	WebElement e= d.findElement(locator);
    	    	 WebDriverWait wait= new WebDriverWait(d,45);
     			boolean inv=wait.until(ExpectedConditions.invisibilityOf(e));
     			System.out.println(inv);
    	     }
    	     
    	     public void webDriverWaitUntilClickable(By locator) {
    	    	 
    	    	 WebElement e=d.findElement(locator);
    	    	 WebDriverWait wait=new WebDriverWait(d,45);
    	    	 wait.until(ExpectedConditions.elementToBeClickable(e));
    	    
    	     }
    	     
    	     public void webDriverWaitUntilTextToBePresent(By locator, String text) {
    	    	 
     	    	WebElement e= d.findElement(locator);
     	    	 WebDriverWait wait= new WebDriverWait(d,45);
      			boolean ttbp=wait.until(ExpectedConditions.textToBePresentInElement(e, text));
      			System.out.println(ttbp);
     	     }
    	     
    	     public void webDriverWaitUntilVisible(By locator) {
    	    	 WebElement e=d.findElement(locator);
    	    	 WebDriverWait wait= new WebDriverWait(d,45);
    	    	 wait.until(ExpectedConditions.visibilityOf(e)).click();
    	     }
    
    	     //Select:
    	     
    	     public void selectByIndex(By locator, int index) {
    	    	 WebElement element=d.findElement(locator);
    	    	 Select select=new Select(element);
    	    	 select.selectByIndex(index);
    	     }
    	     
    	     public void selectByValue(By locator, String value) {
    	    	 WebElement element=d.findElement(locator);
    	    	 Select select=new Select(element);
    	    	 select.selectByValue(value);
    	     }
    	     public void selectByVisibleText(By locator, String text) {
    	    	 WebElement element=d.findElement(locator);
    	    	 Select select=new Select(element);
    	    	 select.selectByVisibleText(text);
    	     }
    	     
    	     
         // Navigate:
    	     
    	     public void navigateTo(String url) {
    	    	 d.navigate().to(url);
    	     }
    	     public void refresh() {
    	    	 d.navigate().refresh();
    	     }
    	     public void backward() {
    	    	 d.navigate().back();
    	     }
    	     public void forward() {
    	    	 d.navigate().forward();
    	     }
    	     
			
    	     
    	     
			
    		 

    	 

}
    
    

