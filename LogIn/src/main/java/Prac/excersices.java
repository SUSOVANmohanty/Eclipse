package Prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excersices {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("dsnlsnl");
		driver.findElement(By.name("pass")).sendKeys("5665");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).submit();
		System.out.println(driver.findElement(By.cssSelector("._9ay7")).getAttribute("Attribute"));
	

	}

}