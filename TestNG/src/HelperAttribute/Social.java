package HelperAttribute;

import org.testng.annotations.Test;

public class Social {
	@Test(groups= {"e"})
	public void eexpedia()
	{
		System.out.println("expedia");
	}
	@Test(groups= {"e"})
	public void emakemytrip()
	{
		System.out.println("makemytrip");
	}
	@Test
	public void agoda()
	{
		System.out.println("agoda");
	}


}