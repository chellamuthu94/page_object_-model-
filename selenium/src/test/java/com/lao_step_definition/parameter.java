package com.lao_step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameter {
	WebDriver driver;
	@Given("user want to login on my contact website")
	public void user_want_to_login_on_my_contact_website() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.mycontactform.com/samples.php");  
	}

	@When("user enter correct name {string} and {string}")
	public void user_enter_correct_name_and(String username , String password) {
		driver.findElement(By.id("user")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password); 
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("btnSubmit")).click();
	}

	@Then("user want to should naviagte to home page")
	public void user_want_to_should_naviagte_to_home_page() {
		boolean status=   driver.findElement(By.linkText("Home")).isDisplayed();
		if(status) {
			System.out.println("ok ");
		}  
	}


}
