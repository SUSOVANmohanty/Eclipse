package Locaters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		String s =driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(s);
	}
}
