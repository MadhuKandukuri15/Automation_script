package testNGpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Machina {
	
	@BeforeClass
	public void befoeclass() {
		System.out.println("before class ");
	}
	
	@Test(groups="smoke")
	public void add() {
		System.out.println("i am test 123");
	}
	@Test
	public void sub() {
		System.out.println("i am test 412");
	}
	@Test
	public void su1b() {
		System.out.println("i am test 412");
	}
	@AfterSuite
	public void iv1() {
		System.out.println("i am after sutie");
	}
//	@BeforeMethod
//	public void iv() {
//		System.out.println("i am before method");
//	}
	@BeforeTest
	public void su11b() {
		System.out.println("i am test 412");
	}
}
