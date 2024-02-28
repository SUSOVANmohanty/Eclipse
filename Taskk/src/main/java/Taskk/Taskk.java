package Taskk;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Taskk {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='']")).sendKeys("7653094097");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		Thread.sleep(32000);
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		Thread.sleep(2000);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter otp please");
		String otp=sc.next();
		driver.findElement(By.xpath("//input[@name='otp0']")).sendKeys(otp);
		driver.findElement(By.xpath("//input[@name='otp1']")).sendKeys(otp);
		driver.findElement(By.xpath("//input[@name='otp2']")).sendKeys(otp);
		driver.findElement(By.xpath("//input[@name='otp3']")).sendKeys(otp);
		Thread.sleep(2000);
		
		
			 Actions ac=new Actions(driver);
			 ac.moveToElement(driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']"))).build().perform();
			 
			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='desktop-user']")));

			 String UserNameActual=driver.findElement(By.xpath("//div[@class='desktop-infoTitle']")).getText();
			 System.out.println(UserNameActual);
			 String Expected="Hello Susovan";
			 if (UserNameActual.equals(Expected)) {
		            System.out.println("The actual name matches the expected name.");
		        } else {
		            System.out.println("The actual name does not match the expected name.");
		        }
			 Thread.sleep(3000);
			 TakesScreenshot scr = (TakesScreenshot) driver;
				File source = scr.getScreenshotAs(OutputType.FILE);
				File dst = new File("F:\\Screens01.png");
				FileUtils.copyFile(source, dst);
				Thread.sleep(5000);
				driver.quit();
				
				//Edge
				WebDriver driverr=new EdgeDriver();
				driverr.get("https://www.myntra.com/register");
				driverr.manage().window().maximize();
				Thread.sleep(1000);
				driverr.findElement(By.xpath("//input[@id='']")).sendKeys("7653094097");
				Thread.sleep(1000);
				driverr.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
				Thread.sleep(32000);
				driverr.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
				Thread.sleep(2000);
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter otp please");
				String otp2=s.next();
				driverr.findElement(By.xpath("(//input[@name='otp0'])[1]")).sendKeys(otp2);
				driverr.findElement(By.xpath("(//input[@name='otp0'])[1]")).sendKeys(otp2);
				driverr.findElement(By.xpath("(//input[@name='otp0'])[1]")).sendKeys(otp2);
				driverr.findElement(By.xpath("(//input[@name='otp0'])[1]")).sendKeys(otp2);
				Thread.sleep(2000);
				
				
					 Actions a=new Actions(driverr);
					 a.moveToElement(driverr.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']"))).build().perform();
					 
					 WebDriverWait w=new WebDriverWait(driverr,Duration.ofSeconds(5));
					 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='desktop-user']")));

					 String UserName=driverr.findElement(By.xpath("//div[@class='desktop-infoTitle']")).getText();
					 System.out.println(UserName);
					 String Expecte="Hello Susovan";
					 if (UserName.equals(Expecte)) {
				            System.out.println("The actual name matches the expected name.");
				        } else {
				            System.out.println("The actual name does not match the expected name.");
				        }
					 Thread.sleep(3000);
					 TakesScreenshot ts = (TakesScreenshot) driverr;
						File sourcee = ts.getScreenshotAs(OutputType.FILE);
						File loc = new File("F:\\Screens02.png");
						FileUtils.copyFile(sourcee, loc);
						Thread.sleep(5000);
						driverr.quit();
		}

	}


