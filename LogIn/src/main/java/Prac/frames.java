package Prac;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		WebElement f=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		Thread.sleep(1000);
	    driver.switchTo().frame(f);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	    

	}

}
