package HelperAttribute;

import org.testng.annotations.Test;

public class Example {
	@Test
	public void snapdeal()
	{
		System.out.println("snapdeal");
	}
	@Test(enabled=false)
	public void ebay()
	{
		System.out.println("ebay");
	}
	@Test
	public void ajio()
	{
		System.out.println("ajio");
	}
	

}
