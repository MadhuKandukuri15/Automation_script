package utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	static String cars[] = { "fjdlsf", "gdfg" };
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(cars[1]);
//		System.setProperty("webdriver.chrome.driver", "C:\\\\softwares\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		driver.manage().window().maximize();
//		String[] vegies = { "brocoli,Cauliflower,Cucumber " };
//
//		List<WebElement> findElements = driver.findElements(By.xpath("//h4[@class='product-name']"));
//		List al = Arrays.asList(vegies);
//
//		for (int i = 0; i < findElements.size(); i++) {
//			String productList = driver.findElements(By.xpath("//h4[@class='product-name']")).get(i).getText();
//			if (productList.contains("Cucumber - 1 Kg")) {
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}
//		}
//
//	}

		// harsha

		Scanner sc = new Scanner(System.in);

		System.out.print("enter string: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;

			}

		}
		System.out.print(count);

	}
}
