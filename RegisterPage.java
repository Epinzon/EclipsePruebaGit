package com.project.choucair;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class RegisterPage extends Base {
  By registerLinkLocator = By .linkText("Sign in");
  By usernameLocator = By.id("email_create");
  By createAccountBtnLocator = By.name("SubmitCreate");
  By submitAccount = By.name("submitAccount");
  By radio1Locator = By.id("uniform-id_gender1");
  By customerFirstnameLocator = By.id("customer_firstname");
  By customerLastnameLocator= By.id("customer_lastname");
  By passwordLocator= By.id("passwd");
  By newsletterLocator = By.id("newsletter");
  By optinLocator = By.id("optin");
  By companyLocator = By.id("company");
  By address1Locator = By.id("address1");
  By address2Locator = By.id("address2");
  By cityLocator = By.id("city");
  By postcodeLocator = By.id("postcode");
  By otherInfLocator = By.id("other");
  By phoneLocator = By.id("phone");
  By phoneMobileLocator = By.id("phone_mobile");
  By aliasLocator = By.id("alias");
  By dropdownListDays = By.name("days");
  By dropdownMonths = By.name("months");
  By dropdownYears = By.name("years");
  By dropdownState = By.name("id_state");

  		  
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
  public void registerUser(WebDriver driver) {
	  click(registerLinkLocator);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	  if (isDisplayed(createAccountBtnLocator)) {
		  type("hemerson_c7@hotmail.com", usernameLocator);
		  click (createAccountBtnLocator);	  
		  click(radio1Locator);
		  type("Hemerson", customerFirstnameLocator);
		  type("Calderón Ardila", customerLastnameLocator);
		  type("hemerson123", passwordLocator);
		  selectDropdownListDays();
		  selectDropdownListMonths();
		  selectDropdownListYears();
		  click(newsletterLocator); 
		  click(optinLocator);
		  type("Itau", companyLocator);
		  type("Cra 11A No.148-50", address1Locator);
		  type("Cra 4 No. 124-60", address2Locator);
		  type("Bucaramanga", cityLocator);
		  selectDropdownListStates();
		  type("00012", postcodeLocator);
		  type("Cerca al parque central", otherInfLocator);
		  type("3157891", phoneLocator);
		  type("3158954947", phoneMobileLocator);
		  type("HCA", aliasLocator);
		  click (submitAccount);
		  
		 

		   
	  }
	  else {
		  System.out.println("Register page was not found");
	  }
  }
  

  public String selectDropdownListDays() {
	  Select selectList= new Select (findElement(dropdownListDays));
	  selectList.selectByVisibleText("4  ");
	  return getText(selectList.getFirstSelectedOption());
	 
  }
  
  public String selectDropdownListMonths() {
	  Select selectList= new Select (findElement(dropdownMonths));
	  selectList.selectByVisibleText("January ");
	  return getText(selectList.getFirstSelectedOption());
	 
  }
  
  public String selectDropdownListYears() {
	  Select selectList= new Select (findElement(dropdownYears));
	  selectList.selectByVisibleText("2021  ");
	  return getText(selectList.getFirstSelectedOption());
	 
  }
	
  
  public String selectDropdownListStates() {
	  Select selectList= new Select (findElement(dropdownState));
	  selectList.selectByVisibleText("California");
	  return getText(selectList.getFirstSelectedOption());
	 
  }
	
  
 
	 

	
} 
 

