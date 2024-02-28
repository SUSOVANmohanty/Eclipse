package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Scenario {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("asus f15 i7");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.linkText("ASUS TUF Gaming F15 (2023) 90WHr Battery, Intel Core i7-12700H 12th Gen, 15.6\" FHD 144Hz, 8GB RTX 4060, Gaming Laptop (16GB/512GB SSD/Windows 11//1-Zone RGB/Gray/2.20 Kg), FX507ZV-LP094W")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		
		
		

	}

}
