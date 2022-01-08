package com.browserLaunching;

public class TC_001 extends BaseTest
{
	
	public static void main(String[] args) throws Exception
	{
		init();
		
		//launch("chrome"); // using directly.. which is not recommended
		launch("chromebrowser"); //using properties file
		//navigateUrl("http://www.amazon.com");
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		
		String Url= driver.getCurrentUrl();
		System.out.println(Url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
	
		
		
	}
}
