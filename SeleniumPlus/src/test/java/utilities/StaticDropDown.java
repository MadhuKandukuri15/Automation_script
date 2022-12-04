package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number = 120;

		System.setProperty("webdriver.chrome.driver", "C:\\\\softwares\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//select[starts-with(@id,'ctl00_mainContent_Drop')]"));
		Select dropdown = new Select(findElement);
		
		dropdown.selectByIndex(2);
		
		
		

		// driver.findElement(By.xpath("//option[contains(text(),'BDT')]")).click();
		System.out.println(Number);

	}

}
