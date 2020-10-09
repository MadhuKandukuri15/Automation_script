package cucumberfirstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberRun {

	WebDriver driver;
	// TODO Auto-generated method stub

	@Given("^the website is open$")
	public void the_website_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("^Madhu is providing valid login password$")
	public void madhu_is_providing_valid_login_password() throws Throwable {
		
		Thread.sleep(1000);
		driver.findElement(By.name("Email")).sendKeys("madhu123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Msd9295$");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

	}

	@Then("^Madhu can see the next page$")
	public void madhu_can_see_the_next_page() throws Throwable {
		String wbmsg = driver.findElement(By.cssSelector("a.account")).getText();
		System.out.println(wbmsg);
		
		
	}

}
