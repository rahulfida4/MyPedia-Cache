package com.pedia.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pedia.qa.util.TsetUtil;

public class TestBase {
	
	public static WebDriver driver;
	 public static Properties prop;
	
	public TestBase(){
		
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Rahul Sinha\\Downloads\\Software\\Autoamtion Labs\\FreeMyPediaTest\\src\\main\\java\\com\\pedia"
					+ "\\qa\\config\\config.properties");
					
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			}catch(IOException e){
			e.printStackTrace();
		}
	}
		
		
	public static void initialization(){
		String browserName =	prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Sinha\\Downloads\\Software\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		
		}else if(browserName.equals("firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TsetUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TsetUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
			
			
			
		}


