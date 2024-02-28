package Crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrwsr {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void browser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	}
	@Test
	public void browsing() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("ldsjhsjkb");
		Thread.sleep(2000);
		WebElement pw=driver.findElement(By.id("pass"));
		pw.sendKeys("454545");
		Thread.sleep(2000);
		WebElement lgin=driver.findElement(By.name("login"));
		lgin.click();
	}
	
	}
