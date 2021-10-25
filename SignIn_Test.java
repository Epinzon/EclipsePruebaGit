package com.project.choucair;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignIn_Test {
	private WebDriver driver;
	SignInPage signInPage;
	
	@Before
	public void setUp() throws Exception{
		signInPage = new SignInPage(driver);
		driver=signInPage.chromeDriverConnection();
		signInPage.visit("http://automationpractice.com/index.php");
		
		
	}
	
	
	@Test
	public void test() throws InterruptedException{
		signInPage.signIn(driver);
		
		
	
	
		
	}
	
	
	@After
	public void tearDown() throws Exception{
		//driver.quit();
		
	}

}
