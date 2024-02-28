package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Real2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento2-demo.magebit.com/admin/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("magebit");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).sendKeys("Demo123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//body/div[@class='menu-wrapper _fixed']/nav[@class='admin__menu']/ul[@id='nav']/li[@id='menu-magento-customer-customer']/a[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='All Customers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value='11']")).click();
	}

}
