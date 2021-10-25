package com.project.choucair;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage extends Base {
	 By registerLinkLocator = By .linkText("Sign in");
	 By usernameLocator = By.id("email");
	 By passwordLocator = By.id("passwd");
	 By loginBtnLocator = By.name("SubmitLogin");
		

	 
	public SignInPage(WebDriver driver) {
		super(driver);

	}
	public void signIn(WebDriver driver) {
		 click(registerLinkLocator);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if (isDisplayed(usernameLocator)) {
			type ("nataliacalderonpinzon@gmail.com",usernameLocator);
			type ("natalia123",passwordLocator);
			 click (loginBtnLocator);
			
		}else {
			System.out.println("email textbox was not present");
		}
		
	}
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(loginBtnLocator);
	}

}
