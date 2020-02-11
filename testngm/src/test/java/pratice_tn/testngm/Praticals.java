package pratice_tn.testngm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Praticals {
	
	
	@BeforeSuite
	public void method1() {
		System.out.println("before suite");
	}
	
	@BeforeClass
	public void method2() {
		System.out.println("before class");
	}
	@BeforeTest
	public void method3() {
		System.out.println("before test");
	}
	@BeforeMethod
	public void method4() {
		System.out.println("before methods");
	}
	
	@Test (expectedExceptions=NullPointerException.class)
	public void car() {
		String s=null;
		System.out.println(s.length());
		
	}
	
	@Test 
public void bike() {
	System.out.println("rayz");
}
	@AfterMethod
	public void method5() {
		System.out.println("after method");
	}
	

}
