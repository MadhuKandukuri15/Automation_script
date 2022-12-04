package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/

public class DriverFactory {


	public static WebDriver getDriver(String key) {

		switch(key=key.toLowerCase()) {
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--disable-notifications");
			//option.addArguments("--lang=es");
			option.addArguments("--disable-confirmations");
			option.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
			return new ChromeDriver(option);
		/*case "ie":
			WebDriverManager.iedriver().arch32().setup();
			return new InternetExplorerDriver();
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();*/
		default:
			throw new UnsupportedOperationException("wrong key"+key);	

		}
	}
	
}
