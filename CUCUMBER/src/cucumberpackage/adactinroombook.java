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

public class adactinroombook {
	
	WebDriver driver;
	
	
	@Given("^user enter login details \\(user name and password\\)$")
	public void user_enter_login_details_user_name_and_password() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://adactin.com/HotelApp/index.php");
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("username")).sendKeys("venkatgamechanger");
	    driver.findElement(By.id("password")).sendKeys("B2N89M");
	    Thread.sleep(1000);
	}

	@When("^user clicks the login buttton$")
	public void user_clicks_the_login_buttton() throws Throwable {
		driver.findElement(By.id("login")).click();
	   
	}

	@When("^user is selecting his location$")
	public void user_is_selecting_his_location() throws Throwable {
	   WebElement location = driver.findElement(By.id("location"));
	   Select sc=new Select(location);
	   sc.selectByVisibleText("Melbourne");
	   
	}

	@When("^user is choosng his hotel$")
	public void user_is_choosng_his_hotel() throws Throwable {
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    hotels.click();
	    Select sca=new Select(hotels);
	    sca.selectByIndex(2);
	}

	@When("^user choosing the room type$")
	public void user_choosing_the_room_type() throws Throwable {
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    roomtype.click();
	    Select scb=new Select(roomtype);
	    scb.selectByValue("Double");
	}

	@Then("^user selecting the no of rooms$")
	public void user_selecting_the_no_of_rooms() throws Throwable {
	    WebElement roomno = driver.findElement(By.id("room_nos"));
	    roomno.click();
	    Select scc=new Select(roomno);
	    scc.selectByValue("3");
	    Thread.sleep(2000);
	    driver.findElement(By.id("datepick_in")).sendKeys("15/01/2020");
		   driver.findElement(By.id("datepick_out")).sendKeys("20/01/2020");
		   
		
	}

	@Then("^user selecting adults per room$")
	public void user_selecting_adults_per_room() throws Throwable {
	   
		WebElement adults = driver.findElement(By.id("adult_room"));
		   adults.click();
		   Select scd=new Select(adults);
		   scd.selectByVisibleText("2 - Two");
		   
		   
	
	}
	@Then("^user selecting childrens per room$")
	public void user_selecting_childrens_per_room() throws Throwable {
	  
		 WebElement childs = driver.findElement(By.id("child_room"));
		   childs.click();
		   Select sce=new Select(childs);
		   sce.selectByVisibleText("2 - Two");
	}

	@Then("^user clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
	  driver.findElement(By.id("Submit")).click();
	}

	@Then("^user clicks the radio button\\(selects\\)$")
	public void user_clicks_the_radio_button_selects() throws Throwable {
	    driver.findElement(By.id("radiobutton_0")).click();
	}

	@Then("^user clicks continue$")
	public void user_clicks_continue() throws Throwable {
	    driver.findElement(By.id("continue")).click();
	}

	@Then("^user provides first and last name$")
	public void user_provides_first_and_last_name() throws Throwable {
	    driver.findElement(By.id("first_name")).sendKeys("venkat");
	    driver.findElement(By.id("last_name")).sendKeys("sgl");
	}

	@Then("^user provides billing address$")
	public void user_provides_billing_address() throws Throwable {
	   driver.findElement(By.id("address")).sendKeys("in this world");
	}

	@Then("^user gives credit card no$")
	public void user_gives_credit_card_no() throws Throwable {
	    driver.findElement(By.id("cc_num")).sendKeys("4562102356842156");
	}

	@Then("^user choose credit card type$")
	public void user_choose_credit_card_type() throws Throwable {
	    WebElement cardtype = driver.findElement(By.id("cc_type"));
	    Select sch=new Select(cardtype);
	    sch.selectByVisibleText("American Express");
	}

	@Then("^userprovides expiry dates$")
	public void userprovides_expiry_dates() throws Throwable {
	   WebElement exp = driver.findElement(By.id("cc_exp_month"));
	   Select sci=new Select(exp);
	   sci.selectByVisibleText("February");
	   Thread.sleep(1000);
	   WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	   Select scj=new Select(expyear);
	   scj.selectByVisibleText("2022");
	}

	@Then("^user provides cvv number$")
	public void user_provides_cvv_number() throws Throwable {
	   driver.findElement(By.id("cc_cvv")).sendKeys("235");
	}

	@Then("^user clicks the book button$")
	public void user_clicks_the_book_button() throws Throwable {
	    driver.findElement(By.id("book_now")).click();
	    Thread.sleep(4000);
	    
	    String text = driver.findElement(By.id("order_no")).getText();
	    System.out.println(text);
	}



}
