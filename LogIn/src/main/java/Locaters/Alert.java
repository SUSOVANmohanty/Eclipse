package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Alert Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[normalize-space()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.switchTo().alert().sendKeys("Yes");
       // System.out.println(driver.switchTo().alert().getText());
	}

}
