package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.io.BufferedReader;

public class RegisSignUp2 {
	
    WebDriver driver;
	
	public RegisSignUp2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[contains(text(), 'New User Signup!')]")  
	public WebElement newUserSignup;
	
	@FindBy(name="name")  
	public WebElement name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")  
	public WebElement email;
	
	@FindBy(xpath="//button[text()='Signup']")  
	public WebElement signupButton;
	
	Random random = new Random();
	String u1="uknowme";
	String u2="@gmail.com";
	int r1 = random.nextInt(100000);
	String s = u1 + r1 + u2;
	    public String readParameterFromFile(String filePath, String parameterName) {
	        String parameterValue = null;
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split("=");
	                if (parts.length == 2 && parts[0].trim().equals(parameterName)) {
	                    parameterValue = parts[1].trim();
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return parameterValue;
	    }
	
	public void signUp() {
	    System.out.println(newUserSignup.isDisplayed());
	    String username = readParameterFromFile("src/main/java/Configuration/Config.properties", "fname");
	    name.sendKeys(username);
	    email.sendKeys(s);
	    signupButton.click();
	}
}
