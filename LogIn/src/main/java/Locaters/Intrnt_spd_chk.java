package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intrnt_spd_chk {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@id='speed-value']")).getText());
		

	}

}
