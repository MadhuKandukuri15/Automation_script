package CodingPracitice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;

public class Stringchange {
	public static void main(String[] args) throws ParseException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:/Users/MS/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();;
    	driver.get("http://demo.guru99.com/V4/");
    	TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File Src=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:/Users/MS/ss.png");

                //Copy file at destination

              


    }
}






