package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class G {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement B=driver.findElement(By.cssSelector("#APjFqb"));
		B.sendKeys("Baby");
		Thread.sleep(2000);
		B.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		B.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		B.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
