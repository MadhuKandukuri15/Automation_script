package practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithJavaScriptExecutor {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/MS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.getWindowHandle();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)(driver);
		// TODO Auto-generated method stub
		
				WebElement text = driver.findElement(By.id("autocomplete"));
				text.click();
				jse.executeScript("arguments[0].value='sjfsl'", text);
		
	}
	}


