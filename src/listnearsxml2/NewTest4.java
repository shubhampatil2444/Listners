package listnearsxml2;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class NewTest4 extends NewTest3 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("on test failed");
		
		Random rad=new Random();
		
		String name=result.getTestName()+rad.nextInt();
		System.out.println(name);
		
		try {
			NewTest5.capture(driver, name);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("on test skiped");
	}

}
