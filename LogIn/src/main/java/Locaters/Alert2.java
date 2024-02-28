package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
