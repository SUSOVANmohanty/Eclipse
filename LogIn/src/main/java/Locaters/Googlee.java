package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Googlee {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Baby");
		List<WebElement>l=driver.findElements(By.className("wM6W7d"));
		System.out.println(l.size());
		int i=1;
		for (WebElement h:l)
		{
			System.out.println(l.get(i).getText());
			if(l.get(i).getText().contains("hamburger"));
		}
		    l.get(i).click();
		

	}

}
