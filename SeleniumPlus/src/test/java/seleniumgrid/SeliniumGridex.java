package seleniumgrid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeliniumGridex {
	static String hubURL;

	public static void main(String... arg) throws IOException, InterruptedException {
		hubURL = "http://192.168.43.99:9653/wd/hub";
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");

		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.ANY);
		WebDriver driver;
		driver = new ChromeDriver();
		driver = new RemoteWebDriver(new URL(hubURL), capability);
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Email")).sendKeys("madhu123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Msd9295$");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

		Thread.sleep(2000);
		String wbmsg = driver.findElement(By.cssSelector("a.account")).getText();
		System.out.println(wbmsg);

	}

}
