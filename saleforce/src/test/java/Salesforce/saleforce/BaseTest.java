package Salesforce.saleforce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest { 
	public WebDriver driver;
	public SFlogin sfl;
	public WebDriver initializeDriver() throws IOException
	{
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\saleforce\\src\\test\\java\\Global\\property\\Global");
	p.load(fis);
	String browser=p.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	return driver;
}
	public SFlogin demo() throws IOException
	{
		driver=initializeDriver();
		SFlogin sfl=new SFlogin(driver);
		sfl.sfurl();
		return sfl;
		
	}
}
