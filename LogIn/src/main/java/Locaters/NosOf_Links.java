package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class NosOf_Links {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement>g=driver.findElements(By.tagName("a"));
		//no.of links
		System.out.println(g.size());
		//for numbering
		int y=1;
		for(WebElement i:g)
		{
		//links name with links
			System.out.println(y+" "+i.getText()+" "+i.getAttribute("href"));
			y++;
			
			}
		}
}


