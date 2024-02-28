package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ReaLife {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='panel header']//a[@id='idWoVsv5Oa']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("firstname")).sendKeys("Vere");
	    Thread.sleep(2000);
	    driver.findElement(By.id("lastname")).sendKeys("Dash");
	    Thread.sleep(2000);
	    driver.findElement(By.id("is_subscribed")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("email_address")).sendKeys("dashvere075@ggmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("Dash@7978");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password-confirmation")).sendKeys("Dash@7978");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='box box-information']//div[@class='box-content']")).getText());
	

	}

}
