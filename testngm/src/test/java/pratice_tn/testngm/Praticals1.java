package pratice_tn.testngm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Praticals1 {
	
	public static WebDriver driver;
	
	@DataProvider(name="credentials")
	public Object[][] credentials(){
		return new Object[][] { {"testuser1", "password1"}, {"testuser2","password2"},{"testuser3","password3"}};
		
	}
	@DataProvider(name="search")
		public Object[][] searchkeyword(){
		return new Object[][] {{"mobiles"},{"sarees"},{"tshirts"},{"mens shoes"},{"wallets"},{"kurta"}};
		}
	@Test
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dataProvider="search")
		public void searchfunctionality(String keyword) {
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyword);
			driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		}


}
