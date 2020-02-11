package pratice_tn.testngm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Praticals3 {
	
	public static WebDriver driver;
  @BeforeTest
  public void driverinitialisation() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  
  }
  @Test
  public void login() {
	  driver.findElement(By.id("email")).sendKeys("venkat");
	  driver.findElement(By.id("pass")).sendKeys("bll111");
	  driver.findElement(By.id("loginbutton")).click();
	  boolean b = driver.findElement(By.xpath("//span[@class='_50f6' and contains(text(),'Log in as Venkat Venkataramani')]")).isDisplayed();
	  System.out.println("the text displayed is "+ b);
  }
  
}
