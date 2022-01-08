package com.browserLaunching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainprop;
	public static Properties childprop;
	public static Properties orprop;
	public static FileInputStream fis;
	
	public static void init() throws Exception 
	{
	//FileInputStream fis=new FileInputStream("C:\\Swathi\\Selenium_Scripts\\Selenium_Project_Nov\\data.properties");
		 fis=new FileInputStream(projectPath+"\\data.properties");
	    p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"\\environment.properties");
		mainprop=new Properties();
		mainprop.load(fis);
		
		String e=mainprop.getProperty("env");
		
		System.out.println(e);
		
		fis=new FileInputStream(projectPath+"\\"+e+".properties");
		childprop=new Properties();
		childprop.load(fis);
		
		fis=new FileInputStream(projectPath+"\\or.properties");
		orprop=new Properties();
		orprop.load(fis);
		
		
		
	}

	public static void launch(String browser) 
	{
		//if(browser.equals("chrome"))
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions option= new ChromeOptions(); //to use the user defined chromeprofile.
			option.addArguments("user-data-dir=C:\\Users\\babuc\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			option.addArguments("--ignore-certificate-errors");
			
			driver= new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childprop.getProperty(Url));
		
		driver.navigate().to(childprop.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) 
	{
		//driver.findElement(By.xpath(orprop.getProperty(locatorKey))).click();
		getElement(locatorKey).click();		
	}

	public static void typeText(String locatorKey, String text)
	{
		//driver.findElement(By.name(orprop.getProperty(locatorKey))).sendKeys(text);
		getElement(locatorKey).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		
		//driver.findElement(By.id(orprop.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
		
	}

	public static WebElement getElement(String locatorKey) 
	{
		WebElement element = null;
		
		if(locatorKey.endsWith("_id"))
			element=driver.findElement(By.id(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_name"))
			element=driver.findElement(By.name(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_classname"))
			element=driver.findElement(By.className(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			element=driver.findElement(By.xpath(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_cssSelector"))
			element=driver.findElement(By.cssSelector(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_linkText"))
			element=driver.findElement(By.linkText(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_partialLinkText"))
			element=driver.findElement(By.partialLinkText(orprop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_tagName"))
			element=driver.findElement(By.tagName(orprop.getProperty(locatorKey)));
		
		
		return element;
		
		
	}
	
	
	
	

}
