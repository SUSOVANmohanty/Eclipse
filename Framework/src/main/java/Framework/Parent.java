package Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parent {
	
	public void demo() {
		System.out.println("Im demo");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("im before method");
	}


}
