package Annotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shopping {
	@BeforeSuite
	public void messho()
	{
		System.out.println("meesho");
	}
	@BeforeTest
	public void alibaba()
	{
		System.out.println("alibaba");
	}
	@BeforeClass
	public void mart()
	{
		System.out.println("mart");
	}

}
