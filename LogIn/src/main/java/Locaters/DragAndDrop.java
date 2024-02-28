package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions a=new Actions(driver);
		WebElement switctoframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(switctoframe);
		WebElement source=driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		a.dragAndDrop(source, target).build().perform();
		System.out.println(driver.findElement(By.id("droppable")));

	}

}