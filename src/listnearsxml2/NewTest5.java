package listnearsxml2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest5 {

	static WebDriver driver;
	public static void capture(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		File Source=tss.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Listener\\screenshots\\s6.png");
		
		FileHandler.copy(Source, destination);
		
		System.out.println("successfuly capture screenshot");
	}
}
