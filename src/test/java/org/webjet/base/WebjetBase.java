package org.webjet.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebjetBase 
{
	public static WebDriver driver = null;
	
	public static void browserLaunch(String key, String value) {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		driver= (WebDriver) new ChromeDriver();
		
	}
	public static void loadUrl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
}
