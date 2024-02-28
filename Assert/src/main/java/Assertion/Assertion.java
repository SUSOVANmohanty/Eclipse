package Assertion;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver=new ChromeDriver();
	@Test
	public void salesforce()
	{
		driver.get("https://www.salesforce.com/");
		String actual=driver.getTitle();
		String expected="Mummy tata";
		Assert.assertEquals(actual, expected);         //This whole is the hard assertion.
	}
	@Test
	public void facebook()
	{
		driver.get("https://www.facebook.com/");
		String actual=driver.getTitle();
		String expected="Facebook – log in or sign up";
		Assert.assertEquals(actual, expected);
	}


}