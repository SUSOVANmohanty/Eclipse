package Locaters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		
		//find element to upload file through sendkeys() txt
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\user\\Desktop\\cv.txt");
		//using action cls normally woh find nhi kr paya
		WebElement button=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions a=new Actions(driver);
		a.moveToElement(button).click().perform();
		
		//upload file using robot cls
		Robot r=new Robot();
		Thread.sleep(2000);
		
		//copy file to clipboard
		StringSelection ss=new StringSelection("C:\\Users\\user\\Desktop\\cv.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//control + v action to paste the file
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
