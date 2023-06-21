package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.AddToCartPage8;
import org.Capstone.Pageobjects.CartPage9;
import org.Capstone.Pageobjects.LoginInvalid7;
import org.Capstone.Pageobjects.LoginPage6;
import org.Capstone.Pageobjects.RegisAccCreated4;
import org.Capstone.Pageobjects.RegisAccDeleted5;
import org.Capstone.Pageobjects.RegisAccInfo3;
import org.Capstone.Pageobjects.RegisHomepage1;
import org.Capstone.Pageobjects.RegisSignUp2;
import org.Capstone.Pageobjects.ReviewDetails11;
import org.Capstone.Pageobjects.ReviewOpen10;
import org.Capstone.Pageobjects.Search12;
import org.Capstone.Pageobjects.Search13;
import org.Capstone.Pageobjects.Search14;
import org.Capstone.Pageobjects.Search15;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesMain extends BaseConfiguration{

	WebDriver driver;
	public RegisHomepage1 clickObj1;
	public RegisSignUp2 clickObj2;	
	public RegisAccCreated4 clickObj4;	
	public RegisAccDeleted5 clickObj5;	
	public RegisAccInfo3 clickObj3;
		
	public LoginPage6 clickObj6;
	
	public LoginInvalid7 clickObj7;
	
    public AddToCartPage8 clickObj8;	
	public CartPage9 clickObj9;
	
	public Search12 clickObj10;
	public Search13 clickObj11;
	public Search14 clickObj12;
	//public LoginPage loginobj;
	public Search15 clickObj13;
	
	public ReviewOpen10 clickObj14;
	public ReviewDetails11 clickObj15;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj1 = new RegisHomepage1(driver);
		clickObj2 = new RegisSignUp2(driver);
		clickObj3 = new RegisAccInfo3(driver);
		clickObj4 = new RegisAccCreated4(driver);
		clickObj5 = new RegisAccDeleted5(driver);
		
		clickObj6 = new LoginPage6(driver);
		
		clickObj7 = new LoginInvalid7(driver);
		
		clickObj8 = new AddToCartPage8(driver);
		clickObj9 = new CartPage9(driver);
		
		clickObj10=new Search12(driver);
		clickObj11=new Search13(driver);
		clickObj12= new Search14(driver);
		//loginobj= new LoginPage(driver);
		clickObj13= new Search15(driver);
		
		clickObj14 = new ReviewOpen10(driver);
		clickObj15 = new ReviewDetails11(driver);
	}
	
	@Test
	public void Test1() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj2.signUp();
		clickObj3.enterAccountInfo();
		clickObj3.addressInfo();
		clickObj4.enterAccountInfo();
		clickObj5.deleteAccountInfo();
	}
	
	@Test
	public void Test2() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj6.loginCheck();
	}
	
	@Test
	public void Test3() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj7.loginInvalidCheck();
	}
	
	@Test
	public void Test4() throws InterruptedException {
		clickObj8.addProducts();
		clickObj9.removeCart();
	}
	
	@Test
	public void Test5() throws InterruptedException {
		 clickObj10.clickProductPage();
		 clickObj11.allProducts();
		 clickObj12.signupLogin();
	     //loginobj.LogIn();
		 clickObj13.ClickonCart();
	}
	
	@Test
	public void Test6() throws InterruptedException {
		clickObj14.reviewClick();
		clickObj15.reviewWrite();
	}

}
