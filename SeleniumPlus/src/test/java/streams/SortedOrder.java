package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortedOrder {

	public static void main(String... arg) {

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
		List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));

		// capturing all webelments into original list

		List<String> originallist = elementslist.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> newlist = originallist.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originallist.equals(newlist));
		System.out.println("madhu you will do it");

	}

}
