package org.webjet.execution;

import org.webjet.base.WebjetBase;

public class WebjetExecution extends WebjetBase
{
public static void main(String[] args) 
{
	browserLaunch("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\WebjetTest\\chrome\\chromedriver.exe");
	loadUrl("https://www.webjet.com.au/flights/");
	
}
}
