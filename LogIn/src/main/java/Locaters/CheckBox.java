package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.form.guide/checkbox/html-form-with-checkbox/");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//p[normalize-space()='Do you want to opt-in for our newsletter?']//input[@type='checkbox']")).click();
		List<WebElement>w=driver.findElements(By.tagName("input"));
		for(WebElement v:w)
		{
			v.click();
		}

	}

}
