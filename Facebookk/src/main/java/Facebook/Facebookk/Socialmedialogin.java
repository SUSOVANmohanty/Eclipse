package Facebook.Facebookk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Socialmedialogin {
	WebDriver driver;
        public Socialmedialogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void login()
	{
		driver.get("https://www.facebook.com/");
	}
	public void dologin(String user, String pswrdd)
	{
		email.sendKeys(user);
		pswrd.sendKeys(pswrdd);
		login.click();
	}
	@FindBy(name="email") WebElement email;
	@FindBy(name="pass") WebElement pswrd;
	@FindBy(name="login") WebElement login;
	
}
