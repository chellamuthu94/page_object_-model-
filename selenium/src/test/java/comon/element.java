package comon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class element {
	 @FindBy (xpath ="//a[@routerlink='/login']")
     public static WebElement login;
	 @FindBy (xpath ="//input[@formcontrolname='email']")
     public static WebElement email1;
	 @FindBy (xpath ="//input[@formcontrolname='password']")
     public static WebElement password1;
	 @FindBy (xpath ="//button[@type='submit']")
     public static WebElement submit1;
	 @FindBy (xpath = "//a[@routerlink='/editor']")
     public static WebElement editor;
	 @FindBy (xpath = "//input[@formcontrolname='title']")
     public static WebElement title;
	 @FindBy (xpath ="//input[@formcontrolname='description']")
     public static WebElement description;
	 @FindBy (xpath ="//*[@formcontrolname='body']")
     public static WebElement body;
	 @FindBy (xpath =" //*[@type=\'button\']")
     public static WebElement button;
	 
}
