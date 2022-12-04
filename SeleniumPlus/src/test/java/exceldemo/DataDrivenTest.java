package exceldemo;

import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bsh.Console;

public class DataDrivenTest {
	WebDriver driver;

	// testcase1
	@Test(priority = 1)
	public void login() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		WebElement e = driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));

		boolean actualValue = e.isEnabled();
		System.out.println(actualValue);
		driver.findElement(By.id("Email")).sendKeys("madhu888@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Msd9295!");
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
		softAssert.assertEquals(e, "false"); // soft assertion terminate only this method
		// Assert.assertEquals(e, "false"); //hard assertion terminate entire execution
		System.out.println("madhu");

	}

	// testcase 3
	@Test(priority = 2, dependsOnMethods = "login")
	public void sinout() {
		driver.findElement(By.className("ico-logout")).click();
		System.out.println("madhu");

	}

}
