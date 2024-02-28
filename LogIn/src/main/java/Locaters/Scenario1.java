package Locaters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='panel header']//a[@id='ideshiJJIf']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Susovan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Mohanty");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#is_subscribed")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#email_address")).sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Xyzlelo@4");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password-confirmation")).sendKeys("Xyzlelo@4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='box box-information'] p")).getText());

	}

}
