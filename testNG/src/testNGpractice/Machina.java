package testNGpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
	public void add1() {
		System.out.println("i am test 123");
	}
	@Test
	public void add2() {
		System.out.println("i am test 123");
	}
	
	
	@Parameters({"URL"})
	@Test
	public void sub(String name) {
		System.out.println("i am test 412");
		
	}
	@Test(dataProvider="dataprovider")
	public void su1b(String s, String p) {
		System.out.println("i am test 412");
		System.out.println(s);
		System.out.println(p);
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
	@DataProvider
	public Object[][] dataprovider() {
		Object data[][]=new Object[2][2];
		data[0][0]="madhu";
		data[0][1]="msd";
		
		data[1][0]="anil";
		data[1][1]="jfsalk";
		return data;
		
	}
	
}
