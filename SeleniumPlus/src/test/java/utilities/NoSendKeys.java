package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\softwares\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://book.spicejet.com/Login.aspx");
		driver.manage().window().maximize();
		JavascriptExecutor JS = (JavascriptExecutor)driver;

		JS.executeScript("document.getElementById('ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID').value='Abha_Rathour'");
		
	}
	
}
