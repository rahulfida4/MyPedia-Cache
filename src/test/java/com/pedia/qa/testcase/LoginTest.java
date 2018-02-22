package com.pedia.qa.testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pedia.qa.base.TestBase;
import com.pedia.qa.pages.HomePage;
import com.pedia.qa.pages.LoginPage;


public class LoginTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	
	public LoginTest(){
		super();
	}
		
		
		@BeforeMethod
		public void setup(){
			initialization();
			loginPage = new LoginPage();
			
		}
		
		
		@Test(priority=1)
		public void loginPageTitleTest(){
	String title =		loginPage.validateLoginPageTitle();
	Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software");
			
		}
		@Test(priority=2)
		public void CRMLogoTest(){
			boolean flag =loginPage.validateCRMImage();
			Assert.assertTrue(flag);
		}
		@Test(priority=3)
		public void loginTest(){
	homePage	=	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		
		
		@AfterMethod
		public void TearDown(){
			driver.close();
		}
	

		
	}


