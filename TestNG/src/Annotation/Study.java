package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Study {
	@AfterClass
	public void byju()
	{
		System.out.println("byjus");
	}
	@AfterMethod
	public void udemy()
	{
		System.out.println("udemy");
	}
	@Test
	public void Coursera()
	{
		System.out.println("Coursera");
	}

}
