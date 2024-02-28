package HelperAttribute;

import org.testng.annotations.Test;

public class Laptop {
	@Test(dependsOnMethods= {"dell", "zephyrus"})
	public void ehp()
	{
		System.out.println("hp");
	}
	@Test(timeOut=1000)
	public void dell()
	{
		System.out.println("dell");
	}
	@Test
	public void acer()
	{
		System.out.println("acer");
	}
	@Test
	public void zephyrus()
	{
		System.out.println("asus");
	}


}
