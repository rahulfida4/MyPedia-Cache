package com.pedia.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pedia.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),' User: Naveen K')")
	WebElement UserNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')")
	WebElement ContactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')")
	WebElement tasksLink;
	
	//Initialize the Page Object:
	
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions:
		
		public String VerifyHomePagetitle(){
			
			return driver.getTitle();
			
		}
		
		public boolean verifyCorrectUser(){
		return	UserNameLabel.isDisplayed();
		}
		
		
		public ConatctsPage clickOnContactsLink(){
			ContactsLink.click();
			return new ConatctsPage();
		}
		
		
		
		public TaskPage clickOnTasksLink(){
			tasksLink.click();
			return new TaskPage();
	

}
}


	
