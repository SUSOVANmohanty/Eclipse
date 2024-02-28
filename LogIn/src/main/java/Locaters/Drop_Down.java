package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    Select drop=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));   
	    Thread.sleep(2000);
	    drop.selectByIndex(5);
	    Thread.sleep(2000);
	    drop.selectByVisibleText("baby");
	    Thread.sleep(2000);
	    drop.selectByValue("search-alias=appliances");
	    Thread.sleep(2000);
	    driver.quit();
	    
		

	}

}
