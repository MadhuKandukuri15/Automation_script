package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPageObject {

	private static WebDriver driver;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")
	public static WebElement login_button;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public static void login() {
		driver.findElement(By.partialLinkText("SignIn")).click();
		LoginPageObject.username.sendKeys("Deeksha");

		LoginPageObject.password.sendKeys("Password123");
		LoginPageObject.login_button.click();

		Assert.assertEquals(driver.getTitle(), "Home");
	}
}
