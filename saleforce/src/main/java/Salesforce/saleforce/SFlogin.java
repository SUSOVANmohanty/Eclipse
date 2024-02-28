package Salesforce.saleforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SFlogin {
	public WebDriver driver;
	public SFlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void sfurl()
	{
		driver.get("https://login.salesforce.com/");
	}
	public void sfcredential(String uname, String pswrd)
	{
		email.sendKeys(uname);
		pass.sendKeys(pswrd);
		lgin.click();
	}
    @FindBy(name="username") WebElement email;
	@FindBy(name="pw") WebElement pass;
	@FindBy(name="Login") WebElement lgin;	
}
