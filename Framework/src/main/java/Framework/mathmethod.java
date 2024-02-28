package Framework;

public class mathmethod extends trick {
	
	int a;
	public mathmethod(int a) {
		super(a);    //parameter to parent cls
		this.a=a;    //initialising
	}
	public int increment()
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}
}
