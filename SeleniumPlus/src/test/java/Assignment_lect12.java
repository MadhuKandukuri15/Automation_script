import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_lect12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String text = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		text = text.replaceFirst("o", "O");
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(text);
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String text2 = driver.switchTo().alert().getText();
		if (text2.contains("Option2")) {
			System.out.println("Option2 is present");
		} else {
			System.out.println("test failed");
		}

	}

}
