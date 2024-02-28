package Prac;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Printthru {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		List<WebElement>l=driver.findElements(By.tagName("a"));
		int i=1;
		for(WebElement h:l)
		{
		System.out.println(l.get(i).getText());
		i++;
		}
		

	}

}
