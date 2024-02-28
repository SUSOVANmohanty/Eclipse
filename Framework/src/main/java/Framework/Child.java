package Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child extends Parent {
	@Test
	public void sample()
	{
		mathmethod mm=new mathmethod(5);   //obj of mathmethod
		mathmethod mm2=new mathmethod(4);     //reference variable se call
		System.out.println(mm.increment());
		System.out.println(mm2.decrement());
		trick t=new trick(8);
		System.out.println(t.multiple());
		System.out.println(t.multiple2());
		
	}
	
}
