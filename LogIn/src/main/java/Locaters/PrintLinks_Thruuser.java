package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
public class PrintLinks_Thruuser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Website");
		String url=s.next();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement>t=driver.findElements(By.tagName("a"));
		System.out.println(t.size());
		int f=1;
		for (WebElement g:t)
		{
			System.out.println(f+" "+g.getText());
			f++;
		}
		
		

	}

}
