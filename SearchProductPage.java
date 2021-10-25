package com.project.choucair;

import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchProductPage extends Base {
	By searchBoxByLocator = By.id("search_query_top");
	By resultsLocator = By.cssSelector("span.heading-counter");
	By submitSearch = By.name("submit_search");

	 
	public SearchProductPage(WebDriver driver) {
		super(driver);

	}
	public void searchProduct(WebDriver driver) {
        WebElement searchBox = driver.findElement(searchBoxByLocator);
	    searchBox.clear();
	    searchBox.sendKeys("blouse");
	    click(submitSearch);
	    WebDriverWait wait =  new WebDriverWait(driver,7);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(resultsLocator));
	    System.out.println("Results"+driver.findElement(resultsLocator).getText());
	     assertEquals(driver.findElement(resultsLocator).getText(), "1 result has been found.");
	
	}
	
	

}
