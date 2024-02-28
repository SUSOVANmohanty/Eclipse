package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Handeling_Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		Thread.sleep(1000);
		driver.manage().window().maximize();
        WebElement w=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(w);
        //click try button
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        driver.switchTo().alert().accept();
	}

}
