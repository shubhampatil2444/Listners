package listenersxml;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class NewTest4 extends NewTest3 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("on test start from listners");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("on test success from listners");
		//TakeScreenshot(driver,result.getTestName());
	}

	public static void TakeScreenshot(WebDriver driver, String testName) {

		TakesScreenshot screen=(TakesScreenshot)driver;
		File s=screen.getScreenshotAs(OutputType.FILE);
		
		int no=1;
		File d=new File("C:\\Users\\Admin\\eclipse-workspace\\Listener\\screenshots\\ss.png");
		no++;
		
		try {
			FileHandler.copy(s, d);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screen shot take successfuly");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		//TakeScreenshot(driver,result.getTestName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("on test skipe from listners");
	}
  
}
