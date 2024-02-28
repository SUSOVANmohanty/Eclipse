package Locaters;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bad {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://expired.badssl.com/");

	}

}
