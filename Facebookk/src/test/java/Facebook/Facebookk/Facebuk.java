package Facebook.Facebookk;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Facebuk {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		
		Socialmedialogin sl=new Socialmedialogin(driver);//driver as an argument 
		sl.login();
		sl.dologin("abc", "456");
	}

}
