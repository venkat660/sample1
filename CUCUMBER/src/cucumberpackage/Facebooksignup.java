package cucumberpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooksignup {
	
	WebDriver driver;
	
	
	@Given("^user intiallize facebook in chrome browser$")
	public void user_intiallize_facebook_in_chrome_browser() throws Throwable {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(4000);
	   
	}

	@When("^user enters first name and surname$")
	public void user_enters_first_name_and_surname() throws Throwable {
	  driver.findElement(By.name("firstname")).sendKeys("venkat");
	  driver.findElement(By.name("lastname")).sendKeys("sgl");
	   Thread.sleep(500);
	    
	}

	@When("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
	  driver.findElement(By.name("reg_email__")).sendKeys("9080295042");
	   Thread.sleep(500);
	}

	@When("^user giving password$")
	public void user_giving_password() throws Throwable {
	 driver.findElement(By.name("reg_passwd__")).sendKeys("5656");
		
		Thread.sleep(500);
	}

	@When("^user selecting date of birth$")
	public void user_selecting_date_of_birth() throws Throwable {
	    WebElement dayd = driver.findElement(By.id("day"));
	    WebElement monthm = driver.findElement(By.id("month"));
	    WebElement yeary = driver.findElement(By.id("year"));
	    
	    Select sc=new Select(dayd);
	    sc.selectByVisibleText("5");
	    Select sca=new Select(monthm);
	    sca.selectByVisibleText("Oct");
	    Select scb=new Select(yeary);
	    scb.selectByVisibleText("1992");

	    Thread.sleep(3000);
	    }

	@Then("^user selecting the gender$")
	public void user_selecting_the_gender() throws Throwable {
	  driver.findElement(By.name("sex")).click();
	   Thread.sleep(2000);
	    
	}

	@Then("^user clicks the signup button$")
	public void user_clicks_the_signup_button() throws Throwable {
	  driver.findElement(By.name("websubmit")).click();
	   
	}



}
