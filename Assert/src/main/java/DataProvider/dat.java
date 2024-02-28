package DataProvider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dat {
	@Test(dataProvider = "Testlogin")
	public void testdata(String un, String pw) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
	}                         //Testlogin is the method name you have to pass it on @Test annotation to fetch data without the name you can't use the dataprovider 

	@DataProvider
	public Object[][] Testlogin() {
		Object[][] data = new Object[2][2];

		data[0][0] = "susovan";
		data[0][1] = "124578";

		data[1][0] = "mohanty";
		data[1][1] = "7978";
		return data;
	}
}
