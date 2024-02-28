import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prac {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
	Select d=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
	d.selectByIndex(2);
	}
	}
	
 