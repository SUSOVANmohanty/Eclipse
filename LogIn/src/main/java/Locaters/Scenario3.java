package Locaters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/admin/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#username")).sendKeys("magebit");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#login")).sendKeys("Demo123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'action-login action-primary')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='menu-magento-catalog-catalog']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[data-ui-id='menu-magento-catalog-catalog-products'] a span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[normalize-space()='Add Product'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("product[name]")).sendKeys("Kiljh");
		Thread.sleep(2000);
		driver.findElement(By.name("product[price]")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.name("product[quantity_and_stock_status][qty]")).sendKeys("4");
		Thread.sleep(2000);
		driver.findElement(By.name("product[weight]")).sendKeys("9");
		driver.findElement(By.id("save-button")).click();
		
		
		

	}
}
