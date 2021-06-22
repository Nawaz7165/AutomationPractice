package com.automationpractice.registration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.automationpractice.framework.UI;

public class RegistrationTest extends TestBase{
	
	@Test
	public void register_a_New_account() {

		// For testing purpose Change the email address at line number 34 and 71.	
		
		UI ui=new UI(driver);

		
//		    Go to http://www.automationpractice.com
		    ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		    ui.click(By.xpath("//a[contains(text(),'Sign in')]"));
//			Enter email address 'abc@mailinator.com' in email address text field of left side
		    ui.sendKeys(By.id("email_create"), "abc@mailinator.com");
//			Click create an account button
		    ui.click(By.xpath("//button[@id='SubmitCreate']"));
//			Verify error message displayed 'An account using this email address has already been registered. Please enter a valid password or request a new one.'
		    ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'An account using this email address has already be')]"), "An account using this email address has already been registered. Please enter a valid password or request a new one.");
//			Enter a valid email address in email address text field. (You can use xxxxxxx@mailinator.com)
		    ui.clear(By.id("email_create"));
		    ui.sendKeys(By.id("email_create"), "rafan31@mailinator.com");
//			Click create an account button
		    ui.click(By.xpath("//button[@id='SubmitCreate']"));
//			Click 'Register' button
		    ui.click(By.xpath("//span[contains(text(),'Register')]"));
//			Verify error message displayed 'You must register at least one phone number.'
		   String opn=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[1]"), "You must register at least one phone number.");
		   System.out.println(opn);
//			Verify error message displayed 'lastname is required.'
		   String ln=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[2]"), "lastname is required.");
		   System.out.println(ln);
//			Verify error message displayed 'firstname is required.'
		   String fn=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[3]"), "firstname is required.");
		   System.out.println(fn);
//			Verify error message displayed 'passwd is required.'
		   String pwd=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[4]"), "passwd is required.");
		   System.out.println(pwd);
//			Verify error message displayed 'address1 is required.'
		   String add1=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[5]"), "address1 is required.");
		   System.out.println(add1);
//			Verify error message displayed 'city is required.'
		   String city=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[6]"), "city is required.");
		   System.out.println(city);
//			Verify error message displayed 'The Zip/Postal code you've entered is invalid. It must follow this format: 00000'
		   String zip=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[7]"), "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
		   System.out.println(zip);
//			Verify error message displayed 'This country requires you to choose a State.'
		   String stName=ui.getTextFromElementAndVarify(By.xpath("//*[@id='center_column']/div/ol/li[8]"), "This country requires you to choose a State.");
		   System.out.println(stName);
//			Select 'Mr' radio button
		   ui.click(By.xpath("//input[@id='id_gender1']"));
//			Enter First name as 'John'
		   ui.sendKeys(By.xpath("//input[@id='customer_firstname']"), "John");
//			Enter Last name as 'Smith'
		   ui.sendKeys(By.xpath("//input[@id='customer_lastname']"), "Smith");
//			Verify Email text box has email address defined as used in step 6
		   String emailId=ui.getAttributeValue(By.xpath("//input[@id='email']"),"value");
		   Assert.assertEquals(emailId, "rafan31@mailinator.com");
		   System.out.println(emailId);
		 
//			Enter password as 'MyStrong_Password'
		  ui.sendKeys(By.xpath("//input[@id='passwd']"), "MyStrong_Password");
//			Select day 15 from day dropdown
		  ui.selectByValue(By.id("days"), "15");
//			Select year 1984 from year dropdown
		  ui.selectByValue(By.id("years"), "1984");
//			Select month September from month dropdown
		  ui.selectByIndex(By.id("months"), 9);
//			Verify First name text field below has first name defined as used in step 18
		  String firstName=ui.getAttributeValue(By.xpath("//input[@id='firstname']"),"value");
		  System.out.println(firstName);
		  Assert.assertEquals(firstName, "John");
//			Verify First name text field below has last name defined as used in step 19
		  String lastName=ui.getAttributeValue(By.xpath("//input[@id='lastname']"),"value");
		  System.out.println(lastName);
		  Assert.assertEquals(lastName, "Smith");
//			Enter Company as 'Time and Training' in Company text field
		  ui.sendKeys(By.id("company"), "Time and Training");
//			Enter address as '123 abc street' in address text field
		  ui.sendKeys(By.xpath("//input[@id='address1']"), "123 abc street");
//			Enter city New York in city text field
		  ui.sendKeys(By.xpath("//input[@id='city']"), "New York");
//			Select state New York from state drop down
		  ui.selectByVisibleText(By.xpath("//select[@id='id_state']"), "New York");
//			Enter '10001' in Zip/Postal Code text field
		  ui.sendKeys(By.xpath("//input[@id='postcode']"), "10001");
//			Select country United States from country dropdown
		  ui.selectByValue(By.xpath("//select[@id='id_country']"), "21");
//			Enter text 'Registering ac account with all fields' in Additional information text area
		  ui.sendKeys(By.xpath("//textarea[@id='other']"), "Registering ac account with all fields");
//			Enter '7031234567' in Home Phone text field
		  ui.sendKeys(By.xpath("//input[@id='phone']"), "7031234567");
//			Enter Enter '7039876543214' in Mobile phone text field
		  ui.sendKeys(By.xpath("//input[@id='phone_mobile']"), "7039876543214");
//			Replace text 'My Address' to 'Home' in Assign an address alias for future reference text field
		  ui.clear(By.xpath("//input[@id='alias']"));
		  ui.sendKeys(By.xpath("//input[@id='alias']"), "Home");
//			Click 'Register' button
		ui.click(By.cssSelector("#submitAccount > span"));
		 //WebDriverWait wait=new WebDriverWait(driver, 60);
		 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitAccount']")));
		 
//			Verify 'MY ACCOUNT' text displayed
		  String myAc=ui.getTextFromElement(By.xpath("//h1[contains(text(),'My account')]"));
		  System.out.println(myAc);
		  Assert.assertEquals(myAc, "MY ACCOUNT");
//			Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		  String welcomeNote=ui.getTextFromElement(By.xpath("//p[contains(text(),'Welcome to your account.')]"));
		  System.out.println(welcomeNote);
		  Assert.assertEquals(welcomeNote, "Welcome to your account. Here you can manage all of your personal information and orders.");
//			Verify 'MY PERSONAL INFORMATION' text displayed
		  String buttonText=ui.getTextFromElementAndVarify(By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span"),"MY PERSONAL INFORMATION");
		  Assert.assertEquals(buttonText, "MY PERSONAL INFORMATION");
		  System.out.println(buttonText);
		  
//			Click 'Sign out' button from top right corner
		  ui.click(By.xpath("//a[@class='logout']"));

	} 
	
	@Test
	public void register_a_New_account_with_missing_required_fields() {
		
		UI ui= new UI(driver);
		
//		    Go to http://www.automationpractice.com
		    ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		    ui.click(By.xpath("//a[contains(text(),'Sign in')]"));
//			Click on 'Create New Account' button
		    ui.click(By.xpath("//button[@id='SubmitCreate']"));
//			Verify validation message displayed 'Invalid email address.'
		   String ied= ui.getTextFromElementAndVarify(By.xpath("//li[contains(text(),'Invalid email address.')]"), "Invalid email address.");
		   System.out.println(ied);
//			Enter an email ddress 'xyz915@mailinator.com' in order to register into the text field
		   ui.sendKeys(By.id("email_create"), "xyz915@mailinator.com");
//			Click on 'Create New Account' button
		   ui.click(By.xpath("//button[@id='SubmitCreate']"));
//			Click on Register Button
		   ui.click(By.cssSelector("#submitAccount > span"));
//			"Verify following validation messages displays:
//			There are 8 errors
		   String err=ui.getTextFromElementAndVarify(By.xpath("//p[contains(text(),'There are 8 errors')]"), "There are 8 errors");
		   System.out.println(err);
//			You must register at least one phone number.
		   String phnNumber=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[1]"), "You must register at least one phone number.");
		   System.out.println(phnNumber);
//			lastname is required.
		   String ln=ui.getTextFromElement(By.xpath("//div[@id='center_column']/div/ol/li[2]"));
		   Assert.assertEquals(ln, "lastname is required.");
		   System.out.println(ln);
//			firstname is required.
		   String fn=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[3]"), "firstname is required.");
		   System.out.println(fn);
//			passwd is required.
		   String pwd=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[4]"), "passwd is required.");
		   System.out.println(pwd);
//			address1 is required.
		   String add1=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[5]"), "address1 is required.");
		   System.out.println(add1);
//			city is required.
		   String city=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[6]"), "city is required.");
		   System.out.println(city);
//			The Zip/Postal code you've entered is invalid. It must follow this format: 00000
		   String postalCode=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[7]"), "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
		   System.out.println(postalCode);
//			This country requires you to choose a State."
		   String state=ui.getTextFromElementAndVarify(By.xpath("//div[@id='center_column']/div/ol/li[8]"), "This country requires you to choose a State.");
		   System.out.println(state);

	}
	
	@Test
	public void register_a_new_account_only_with_required_fields() {
		
		UI ui= new UI(driver);
		
//		    Go to http://www.automationpractice.com
		    ui.openUrl("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		    ui.click(By.xpath("//a[@class='login']"));
//			Enter email address 'XYZ123@mailinator.com' in email address text field of left side, where 'XYZ123' can be random letter and random number
		    
		    String rand_num=RandomStringUtils.randomNumeric(3);
		    String rand_letter=RandomStringUtils.randomAlphabetic(3);
		    String add_name=rand_letter.concat(rand_num);
		    System.out.println(add_name);
		    String add_path="@mailinator.com";
		    String emailId=add_name.concat(add_path);
		    System.out.println(emailId);
		    
		    ui.sendKeys(By.xpath("//input[@id='email_create']"),emailId );
//			Click create an account button
		    ui.click(By.xpath("//button[@id='SubmitCreate']"));
//			Enter first name
		    ui.sendKeys(By.xpath("//input[@id='customer_firstname']"), "Areeb");
//			Enter last name
		    ui.sendKeys(By.xpath("//input[@id='customer_lastname']"), "Nawaz");
//			Enter password
		    ui.sendKeys(By.xpath("//input[@id='passwd']"), "abc1234");
//			Enter address
		    ui.sendKeys(By.xpath("//input[@id='address1']"), "2020 Wallace Ave.");
//			Enter city
		    ui.sendKeys(By.xpath("//input[@id='city']"), "Bronx");
//			Enter state
		    ui.selectByVisibleText(By.xpath("//select[@id='id_state']"), "New York");
//			Enter zipcode
		    ui.sendKeys(By.xpath("//input[@id='postcode']"), "10462");
//			Enter country
		    
//			Enter mobile phone number
		    ui.sendKeys(By.xpath("//input[@id='phone_mobile']"), "7089456");
//			Enter alias as 'My Home Address'
		    ui.clear(By.xpath("//input[@id='alias']"));
		    ui.sendKeys(By.xpath("//input[@id='alias']"), "My Home Address");
//			Click on Regitser button
		    ui.click(By.cssSelector("#submitAccount > span"));
//			Verify welcome message displays 'Welcome to your account. Here you can manage all of your personal information and orders.'
		    String welcome_msg=ui.getTextFromElementAndVarify(By.xpath("//p[contains(text(),'Welcome to your account')]"), "Welcome to your account. Here you can manage all of your personal information and orders.");
		    System.out.println(welcome_msg);
//			Verify firstname and lastname displays on top right corner
		   String first_lastName=ui.getTextFromElementAndVarify(By.xpath("//a[@class='account']"),"Areeb Nawaz");
		   Assert.assertEquals(first_lastName, "Areeb Nawaz");
		    System.out.println(first_lastName);

	}
	
	

}
