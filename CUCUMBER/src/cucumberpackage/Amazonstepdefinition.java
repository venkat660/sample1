package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Amazonstepdefinition {
	
	WebDriver driver;
	
	@Given("^user intialize amazon in chrome browser$")
	public void user_intialize_amazon_in_chrome_browser() throws Throwable {
	    
	    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    Thread.sleep(2000);
	    
	}

	@When("^user search for a mobile phone$")
	public void user_search_for_a_mobile_phone() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsumng mobiles",Keys.ENTER);
		Thread.sleep(3000);
	   
	}

	@And("^user selects a model$")
	public void user_selects_a_model() throws Throwable {
	    driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'Samsung Galaxy A20 32GB A205G/DS 6.4\" HD+ 4,000mAh Battery LTE Factory Unlocked GSM Smartphone (International Version, No Warranty) (Deep Blue)')]")).click();
	}

	@When("^switching to a new window$")
	public void switching_to_a_new_window() throws Throwable {
		Thread.sleep(2000);
	   
	}

	@When("^user add item to the cart$")
	public void user_add_item_to_the_cart() throws Throwable {
	    driver.findElement(By.id("add-to-cart-button")).click();
	}

	@Given("^user intialize flipkart in chrome browser$")
	public void user_intialize_flipkart_in_chrome_browser() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	   Thread.sleep(3000);
	}

	@When("^user search for a samsung mobile phone$")
	public void user_search_for_a_samsung_mobile_phone() throws Throwable {
	   driver.findElement(By.name("q")).sendKeys("mobile phones",Keys.ENTER);
	   Thread.sleep(2000);
	}
	@When("^user choosing a product$")
	public void user_choosing_a_product() throws Throwable {
	    driver.findElement(By.xpath("//div[@class='_3wU53n'][contains(text(),'Redmi 8 (Sapphire Blue, 64 GB)')]")).click();
	    Thread.sleep(2000);
	}


}
