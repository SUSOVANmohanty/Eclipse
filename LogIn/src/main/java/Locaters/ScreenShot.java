package Locaters;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(12000);
		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		File dst = new File("F:\\Screens1.png");
		FileUtils.copyFile(source, dst);

	}

}
