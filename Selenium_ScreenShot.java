package SeleniumDrugiDan;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "/home/neda/Downloads/chromedriver_linux64/chromedriver");
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.nationalgeographic.rs/");
		TakesScreenshot scrShot = ((TakesScreenshot)wd);
		File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile= new File("/home/neda/Desktop/screenshot.png");
		FileUtils.copyFile(ScrFile, destFile);
		
		
		wd.close();
		}

}
