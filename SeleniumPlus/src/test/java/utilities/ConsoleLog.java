package utilities;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.Test;

public class ConsoleLog {
  @Test
  public void f() {
	  
	 

	  	
	  		System.setProperty("webdriver.chrome.driver", "C:\\\\softwares\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	  		WebDriver driver = new ChromeDriver();
	  		
	  		driver.get("https://www.amazon.in/ghsd");
			driver.manage().window().maximize();
			LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
			for (LogEntry entry : logEntries) {
				System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
				// do something useful with the data
			}
	  		
	  		//driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();;
//	  		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
//	  		for (LogEntry entry : logEntries) {
//	  			System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
//	  			// do something useful with the data
//	  		}
	  	}

	  

	  
  }

