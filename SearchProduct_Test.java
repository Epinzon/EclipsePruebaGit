package com.project.choucair;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchProduct_Test {
	private WebDriver driver;
	SearchProductPage searchProductPage;
	
	@Before
	public void setUp() throws Exception{
		searchProductPage = new SearchProductPage(driver);
		driver=searchProductPage.chromeDriverConnection();
		searchProductPage.visit("http://automationpractice.com/index.php");
		
		
	}
	
	
	@Test
	public void test() throws InterruptedException{
		searchProductPage.searchProduct(driver);
		
		
	
	
		
	}
	
	
	@After
	public void tearDown() throws Exception{
		//driver.quit();
		
	}

}
