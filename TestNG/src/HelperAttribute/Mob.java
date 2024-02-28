package HelperAttribute;

import org.testng.annotations.Test;

public class Mob {
	@Test                       //bydefault usko 0le gya
	public void oneplus()
	{
		System.out.println("1+");
	}
	@Test(priority=1)
	public void samsung()
	{
		System.out.println("samsung");
	}
	@Test(priority=2)
	public void apple()
	{
		System.out.println("apple");
	}

}
