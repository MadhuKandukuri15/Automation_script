package org.SeleniumPlus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LoginPageObject;
import utilities.DriverFactory;

public class LoginTestMe {

	private WebDriver driver;

	@Test(priority = 1)
	public void login() {
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		Assert.assertEquals("Home", driver.getTitle());
		LoginPageObject.login();
	}

	@Test(priority = 2)
	public void search_product() throws InterruptedException {

		Actions act = new Actions(driver);
		Thread.sleep(1000);

		WebElement allCat = driver.findElement(By.xpath("//*[@id='menu3']/li[2]/a/span"));

		
		
		
		act.moveToElement(allCat).perform();

		WebElement product = driver.findElement(By.xpath("//*[@id='menu3']/li[2]/ul/li[1]/a/span"));
		act.moveToElement(product).click().build().perform();

		Thread.sleep(1000);

		WebElement productType = driver.findElement(By.xpath("//*[@id='submenuul11290']/li[1]/a/span"));

		act.moveToElement(productType).click().build().perform();
	}

	@BeforeTest
	public void beforeTest() {
		driver = DriverFactory.getDriver("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, LoginPageObject.class);
	}

	@AfterTest
	public void afterTest() {

		// driver.close();
	}

}
