package com.lao_step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class automation {
	WebDriver driver;
	@Given("user should cerate a my contact")
	public void user_should_cerate_a_my_contact() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");  
	}
	@When("user navigate step by step process")
	public void user_navigate_step_by_step_process() {
		driver.findElement(By.id("user")).sendKeys("Prabhu123");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("btnSubmit")).click();
		driver.findElement(By.xpath("//*[text()='New Form Wizard']")).click();
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("formname")).sendKeys("brick");
		driver.findElement(By.id("referrer")).sendKeys("tttio");
		driver.findElement(By.id("Submit")).click();
	    driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//input[@type='radio' and@value='2']")).click();
	    driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//input[@type='radio' and@value='0']")).click(); 
	}
	@When("click next button")
	public void click_next_button() {
		 driver.findElement(By.id("Submit")).click();                                             
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.name("numquestions")).sendKeys("1");
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.className("long_txt")).sendKeys("123");
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("mandatorycheck")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.name("redirectpage")).sendKeys("google");
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.xpath("//*[@name='fontcolor']")).clear();
		    driver.findElement(By.xpath("//*[@name='fontcolor']")).sendKeys("#382b1b"); 
		    driver.findElement(By.name("bold")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		    driver.findElement(By.id("Submit")).click();
		   
	}
	@Then("user create a my contact its becomes out")
	public void user_create_a_my_contact_its_becomes_out() {
		driver.findElement(By.id("previous")).click();
	}
}
