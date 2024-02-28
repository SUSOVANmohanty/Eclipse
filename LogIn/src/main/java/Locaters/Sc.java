package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Sc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("magebit");
		driver.findElement(By.id("login")).sendKeys("Demo123");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//span[text()='Catalog']")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.id("add_new_product-button")).click();
		
		driver.findElement(By.name("product[name]")).sendKeys("t1-Shirt");
		driver.findElement(By.name("product[price]")).sendKeys("5000");
		driver.findElement(By.name("product[quantity_and_stock_status][qty]")).sendKeys("100");
		driver.findElement(By.name("product[weight]")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save']")).click();

	}

}
