package functional;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Funl {
	
	public static WebDriver driver;
	

	
	public static void browserlaunch() {
	
	try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkat\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();	
}  catch (Exception e) {
	System.out.println(e.getStackTrace());
}
	}
		public static void openurl(String url) {
			try {
				driver.get(url);
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
}

		public static void entertext(WebElement element, String value) {
			try {
			element.sendKeys(value);
		} catch (Exception e)  {
			System.out.println(e.getStackTrace());
		}
}
		public static void clickbutton(WebElement element) {
			try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
}
		public static void mouseaction(WebElement element) {
			try {
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
}
		public static void waitforelementvisibility(WebElement element) {
			try {
			WebDriverWait wait =new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		}
		public static void switchtowindows(int index) {
		try {
		
		Set<String> allwindow = driver.getWindowHandles();
			java.util.List<String> li=new ArrayList<String>();
		li.addAll(allwindow);
		String winid = li.get(index);
		driver.switchTo().window(winid);
		
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
			
				
		}
		public static void dropdown(WebElement element, String values) throws Exception {
			try {
			
			Select sc=new Select(element);
				sc.selectByValue(values);
			
			
		}catch (Exception e)  {
			
			System.out.println(e.getStackTrace());
		
		}
		}
		
		public static void close() {
			driver.close();
		}
		
		}



