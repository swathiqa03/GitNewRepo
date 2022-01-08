package com.browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		typeText("amazontextbox_name","Harry Potter");
		clickElement("amazonsearchbutton_xpath");
		
		
		
		
		/*//using properties file
		 * WebElement loc =
		 * driver.findElement(By.id(orprop.getProperty("amazondropdown_id")));
		 * loc.sendKeys("Books");
		 * 
		 * driver.findElement(By.name(orprop.getProperty("amazontextbox_name"))).
		 * sendKeys("Harry Potter");
		 * 
		 * driver.findElement(By.xpath(orprop.getProperty("amazonsearchbutton_xpath"))).
		 * click();
		 */
		 
		
		/*//using directly
		 * WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		 * loc.sendKeys("Books");
		 * 
		 * driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		 * 
		 * driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 */
		
		driver.close();

	}

	

}
