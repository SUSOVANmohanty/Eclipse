import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xyz {
	@Test
 public void methodA()
 {
	 System.out.println("method executed");
 }
	@Test
	 public void methodB()
	 {
		 System.out.println("method executed");
	 }
	@Test
	 public void methodC()
	 {
		 System.out.println("method executed");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String s= driver.getTitle();
		 Assert.assertEquals("s","s");
	 }
}
