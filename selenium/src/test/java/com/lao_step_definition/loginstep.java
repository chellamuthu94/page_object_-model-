package com.lao_step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
	WebDriver driver;
	@Given("user want to login on my contact")
	public void user_want_to_login_on_my_contact() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.mycontactform.com/samples.php");
	}

	@When("user enter valid userneme and password")
	public void user_enter_valid_userneme_and_password() {
		driver.findElement(By.id("user")).sendKeys("Prabhu123");
		driver.findElement(By.id("pass")).sendKeys("12345"); 
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.name("btnSubmit")).click();
	}

	@Then("user should naviagte to home page")
	public void user_should_naviagte_to_home_page() {
		boolean status=   driver.findElement(By.linkText("Home")).isDisplayed();
		if(status) {
			System.out.println("ok ");
		}
	}
}
 