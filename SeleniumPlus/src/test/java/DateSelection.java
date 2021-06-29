import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateSelection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		while (!driver.findElement(By.cssSelector("[id='rb-calendar_onward_cal'] td[class='monthTitle']")).getText()
				.contains("Mar")) {

			driver.findElement(By.cssSelector("[class='rb-calendar'] td[class='next']")).click();
		}

		List<WebElement> findElements = driver.findElements(By.xpath("//*[@class='wd day']"));
		int c = driver.findElements(By.xpath("//td[@class='wd day']")).size();
		System.out.println(c);
		for (int i = 0; i < c; i++) {

			String text = driver.findElements(By.xpath("//*[@class='wd day']")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {

				driver.findElements(By.xpath("//*[@class='wd day']")).get(i).click();
				break;
			}
		}
	}
}
