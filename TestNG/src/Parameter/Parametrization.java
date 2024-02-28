package Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parametrization {
	@Test
	public void social()
	{
		System.out.println("facebook");
	}
	@Test
	public void study()
	{
		System.out.println("byjus");
	}
	@Parameters("URL")
	@Test
	public void travel(String url)
	{
		System.out.println("agoda");
		System.out.println(url);
	}

}
