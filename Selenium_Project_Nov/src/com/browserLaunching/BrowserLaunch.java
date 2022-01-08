package com.browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "C:\\Swathi\\Selenium_Scripts\\lib\\chromedriver.exe\\");
		
     driver=new ChromeDriver();

	}

}
