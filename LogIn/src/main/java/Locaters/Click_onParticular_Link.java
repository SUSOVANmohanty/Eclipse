   package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Click_onParticular_Link {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement>we=driver.findElements(By.tagName("a"));
		System.out.println(we.size());
		int i=1;
		for(WebElement d:we)
		{
			System.out.println(we.get(i).getText());
			if(we.get(i).getText().contains("Games"));
			{
				we.get(i).click();
				break;
			}
		}

	}

}
