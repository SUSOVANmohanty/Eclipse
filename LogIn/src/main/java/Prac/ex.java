package Prac;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("ASUS");

		List<WebElement> l = driver.findElements(By.className("wM6W7d"));
		Thread.sleep(2000);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
			
			if (l.get(i).getText().contains("laptop")) {
				
				l.get(i).click();
				break;
			}
		}

	}
}
