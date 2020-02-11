package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Facebookbackgroundsd {
	
	WebDriver driver;
	
	
	@Given("^user initialize browser$")
	public void user_initialize_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    
	}

	@When("^user enters name and password$")
	public void user_enters_name_and_password() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("venkat");
	    driver.findElement(By.id("pass")).sendKeys("123456");
	    Thread.sleep(2000);
	}

	@And("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		
	   
	}

	@When("^user clicks forgot password$")
	public void user_clicks_forgot_password() throws Throwable {
	    driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
	}



}
