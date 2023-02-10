package com.lao_step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonutitlity.proerties;
import io.cucumber.java.Before;

public class step_definition {
	public static WebDriver driver;
	@Before 
public void before() {
		proerties.loadproperies1();
		if (driver==null) { 
			launchbrowser();	
		}
	
}

public void launchbrowser() {
	try {
		switch ("chrome") {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();	
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			 break;
		default:
			System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			break;
		}
	} catch (Exception e) {
		
	}
}

}
