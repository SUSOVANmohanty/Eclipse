package Locaters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealLife_3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://magento2-demo.magebit.com/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login[username]")).sendKeys("magebit");
		driver.findElement(By.name("login[password]")).sendKeys("Demo123");
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-magento-catalog-catalog")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-ui-id='menu-magento-catalog-catalog-products']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add_new_product-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("product[name]")).sendKeys("Eero");
		Thread.sleep(2000);
		driver.findElement(By.name("product[price]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.name("product[quantity_and_stock_status][qty]")).sendKeys("40");
		Thread.sleep(2000);
		driver.findElement(By.name("product[weight]")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='My Account']"))).build().perform();
		Robot r=new Robot();                      
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}