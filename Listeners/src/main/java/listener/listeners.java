package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners {
	
	public class Listners  implements ITestListener
    {
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This is success method");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("i got failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skip test");
	}
	public void OnStart(ITestResult result) {
		System.out.println("start");
	}
	public void OnFinish(ITestResult result) {
		System.out.println("Finish");
	}
    }
}
