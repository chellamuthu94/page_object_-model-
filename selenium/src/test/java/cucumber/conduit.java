package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import comon.element;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class conduit {
	static WebDriver driver;
	 
	 public static  void intielement() {
          PageFactory.initElements(driver,element.class);
	 }
	@Given("I want to login the conducit website so sign in account")
	public void i_want_to_login_the_conducit_website_so_sign_in_account() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
		 
	}

	@Given("enter the valid uername and password")
	public void enter_the_valid_uername_and_password() {
		conduit.intielement();
		element.login.click();
		element.email1.sendKeys("tabexa7094@dnitem.com");
		 element.password1.sendKeys("chella");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		
		element.submit1.click();
		
	}

	@When("user should create the new article")
	public void user_should_create_the_new_article() {
	
	  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("user click the article button")
	public void user_click_the_article_button() {
	 element.editor.click();
	}

	@When("userenter article")
	public void userenter_article() {
	    element.title.sendKeys("happy");
	}

	@When("user write about the article")
	public void user_write_about_the_article() {
	   element.description.sendKeys("In life happy");
	}

	@When("user write your article")
	public void user_write_your_article() {
		element.body.sendKeys("life is a magic so beliver that happyness");
	}

	@When("click published button")
	public void click_published_button() {
	   element.button.click(); 
	}

}
