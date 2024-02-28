package Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Social {
	@BeforeMethod
	public void fb()
	{
		System.out.println("facebook");
	}
	@AfterSuite
	public void telegram()
	{
		System.out.println("telegram");
	}
	@AfterTest
	public void insta()
	{
		System.out.println("instagram");
	}
	

}
