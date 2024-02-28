package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	JavascriptExecutor je=(JavascriptExecutor)driver;  //type cast of javascriptExcecutor
	Thread.sleep(2000);
	je.executeScript("window.scrollBy(0,3000)", "");   //method scroll down
	Thread.sleep(2000);
	je.executeScript("window.scrollBy(0,-1500)", ""); //scrollUp
	driver.findElement(By.linkText("Who We Are"));                    //scroll to specific element
	je.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Who We Are"))); //scroll to specific element
	je.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");        //scroll Down                   
	Thread.sleep(1000);
	je.executeScript("window.scrollBy(180,document.body.scrollHeight)", "");     
	}

}
