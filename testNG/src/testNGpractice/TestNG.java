package testNGpractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class TestNG {
	
	
	@Test(groups="smokes")
	public void disH() {
		
		System.out.println("first test ng");
	}
	@BeforeSuite
	public void div() {
		System.out.println("i am last");
	}
	
//	@BeforeTest
//	public void add() {
//		System.out.println("i will execute before test");
//	}
//	@AfterTest
//	public void div() {
//		System.out.println("i will execute after test");
//	}
	
	
}
