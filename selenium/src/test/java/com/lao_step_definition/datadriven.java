package com.lao_step_definition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datadriven {
	WebDriver driver;
	@Given("^user login to my contact website$")
	public void user_login_to_my_contact_website() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.mycontactform.com/samples.php");   
	}
	@When("user enter the below credentails \"([^\"]*)\"\"([^\\\"]*)\"$")
	public void user_enter_the_below_credentails(String username, String password) {
		driver.findElement(By.id("user")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password); 
	}
	@When("^click login$")
	public void click_login() {
		driver.findElement(By.name("btnSubmit")).click();
	}
	@Then("^user naviagte to home page$")
	public void user_naviagte_to_home_page() {
		boolean status=   driver.findElement(By.linkText("Home")).isDisplayed();
		if(status) {
			System.out.println("ok ");
		}  
	}
	
	

}
