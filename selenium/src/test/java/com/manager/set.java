package com.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set {
	WebDriver driver;
	public void launch() {
		
		if("chrome" != null) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();	
		}
	}
}