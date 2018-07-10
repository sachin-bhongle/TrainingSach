package TestPackage;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void f() {
		System.out.println("You are in actual method!!");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("You are in Before method!!");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("You are in After method!!");

	}

}
