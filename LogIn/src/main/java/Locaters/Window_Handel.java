package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Window_Handel {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.linkText("Messenger"))).contextClick().build().perform();
		WebDriverWait wdv=new WebDriverWait(driver,Duration.ofSeconds(3));
		//wdv.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Messenger")));
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		a.moveToElement(driver.findElement(By.linkText("Create a Page"))).contextClick().build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create a Page")));
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.linkText("Meta Store"))).contextClick().build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles().size());  //for print how many nos of handel you open
		Set<String> window = driver.getWindowHandles();       //save all window handel in string from set data structure ke andar
		Iterator<String> it = window.iterator();              
		String parent = it.next();
		String child1 = it.next();
		String child2 = it.next();
		String child3 = it.next();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child3);
		System.out.println(driver.getTitle());
	}
}
