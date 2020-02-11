package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class fblog {
	
	WebDriver driver;
	@Given("^user intialize chrome browser$")
	public void user_intialize_chrome_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	}

	@Given("^user in fb page$")
	public void user_in_fb_page() throws Throwable {
	   
	 Thread.sleep(1000);
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("venkat");
	    
	}

	@When("^user enter invalid password$")
	public void user_enter_invalid_password() throws Throwable {
	   driver.findElement(By.id("pass")).sendKeys("jjjj");
	 
	}

	@When("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
	  driver.findElement(By.id("loginbutton")).click();
	   
	}



}
