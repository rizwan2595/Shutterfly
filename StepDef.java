package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Local{
	static WebDriver driver;
	@Given("User is on gettyimages homepage")
	public void user_is_on_gettyimages_homepage() {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh hunt\\Music\\Task\\Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.gettyimages.in/");	    
	}

	@When("User clicks on signup button")
	public void user_clicks_on_signup_button() throws InterruptedException {
		WebElement sign = driver.findElement(By.xpath("//a[text()='SIGN IN']"));
		sign.click();
	}

	@When("User clicks on Register tab")
	public void user_clicks_on_Register_tab() {
	    WebElement btnRegister = driver.findElement(By.xpath("//div[text()='REGISTER']"));
	    btnRegister.click();
	    
	}

	@When("User enters all the details {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_enters_all_the_details(String Firstname, String Lastname, String Companytype, String Companyname, String Jobtitle, String Companyemail, String Telnum, String Ext, String Password) {
	    WebElement txtFirstname = driver.findElement(By.id("register_first_name"));
	    txtFirstname.sendKeys(Firstname);
	    WebElement txtLastname = driver.findElement(By.id("register_last_name"));
	    txtLastname.sendKeys(Lastname);
	    WebElement companyType = driver.findElement(By.id("register_organization_type"));
	    selectByVisText(companyType, Companytype);
	    WebElement companyName = driver.findElement(By.id("register_organization_name"));
	    companyName.sendKeys(Companyemail);
	    WebElement jobTitle = driver.findElement(By.id("register_job_title"));
	    selectByVisText(jobTitle, Jobtitle);
	    WebElement companyEmail =driver.findElement(By.id("register_email"));
	    companyEmail.sendKeys(Companyemail);
	    
	    WebElement teleNum =driver.findElement(By.id("register_telephone"));
	    teleNum.sendKeys(Telnum);
	    
	    WebElement extNum =driver.findElement(By.id("register_extension"));
	    extNum.sendKeys(Ext);
	    
	    WebElement regPass =driver.findElement(By.id("register_password"));
	    regPass.sendKeys(Password);
	    
	    WebElement yesEnable =driver.findElement(By.id("register_email_preference"));
	    yesEnable.click();
	      
	    
	}

	@Then("User clicks on Register button")
	public void user_clicks_on_Register_button() {
		WebElement regBtn =driver.findElement(By.id("register-button"));
		regBtn.click();
		
	    
	}

//	
//	@Then("User should verify creative page and print image names without duplicate")
//	public void user_should_verify_creative_page_and_print_image_names_without_duplicate() {
//	    WebElement creativePage = driver.findElement(By.xpath("(//a[@target='_self'])[3]")); 
//	     btnClick(creativePage);
//	}
//
//	@Then("User should create board Icon")
//	public void user_should_create_board_Icon() {
//	     
//	     
//	}

	@Then("User should add any image to the board and verify it successfully")
	public void user_should_add_any_image_to_the_board_and_verify_it_successfully() {
	     
	     
	}

	
	
	

}
