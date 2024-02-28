package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class randmly {
	
	@Test
	public void Test_Success()
	{
		System.out.println("this is my success test");
	}
	@Test
	public void Test_Failure()
	{
		System.out.println("this is my failure test");
		Assert.assertTrue(false);
	}
	@Test
	public void Test_Skipped() {
	throw new SkipException("this is my skip test");
	}
	@Test
	public void on_Start()
	{
		System.out.println("this is my onstart");
	}
	@Test
	public void on_Finish()
	{
		System.out.println("this is my onfinish");
	}
}
