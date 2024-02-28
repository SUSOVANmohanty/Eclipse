package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Scenario2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys("magebit");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login")).sendKeys("Demo123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'action-login action-primary')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='menu-magento-customer-customer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("All Customers")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("idscheck2")).click();
		Thread.sleep(1000);
		
		
	}

}
