package org.Capstone.Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewDetails11 {
	
 WebDriver driver;

   public ReviewDetails11(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath="//*[text()='Write Your Review']")
   public WebElement reviewMessage;
   
   @FindBy(id="name")
   public WebElement nameReview;
   
   @FindBy(id="email")
   public WebElement emailReview;
   
   @FindBy(id="review")
   public WebElement writeReview;
   
   @FindBy(id="button-review")
   public WebElement submitReview;  

   RegisSignUp2 nin = new RegisSignUp2(driver);

   
   public void reviewWrite()
   {

	   String rname = nin.readParameterFromFile("src/main/java/Configuration/Config.properties", "revname");
	   String radd = nin.readParameterFromFile("src/main/java/Configuration/Config.properties", "revaddress");
	   String rreview = nin.readParameterFromFile("src/main/java/Configuration/Config.properties", "revreview");
		
	   reviewMessage.isDisplayed();
	   nameReview.sendKeys(rname);
	   emailReview.sendKeys(radd);
	   writeReview.sendKeys(rreview);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,250)");
	   submitReview.click();
   }

}