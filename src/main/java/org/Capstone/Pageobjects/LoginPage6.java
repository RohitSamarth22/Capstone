package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage6 {
	
    WebDriver driver;
	
	public LoginPage6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[contains(text(), 'Login to your account')]")  
	public WebElement loginText;
	
	@FindBy(xpath="(//input[@name='email'])[1]")  
	public WebElement email;
	
	@FindBy(name="password")  
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")  
	public WebElement loginButton;
	
	@FindBy(xpath="//*[text()=' Logout']")
	public WebElement logout;

	
	@FindBy(xpath="//*[text()=' Home']")
	public WebElement homeIcon;
	
	RegisSignUp2 nin = new RegisSignUp2(driver);

	
	public void loginCheck() {
		String log = nin.readParameterFromFile("src/main/java/Configuration/Config.properties", "login");
		String pass = nin.readParameterFromFile("src/main/java/Configuration/Config.properties", "pass");
		   
		Assert.assertEquals(loginText.isDisplayed(), true);
	    email.sendKeys(log);
	    password.sendKeys(pass);
	    loginButton.click();
	    logout.click();
	    homeIcon.click();
	}
}
