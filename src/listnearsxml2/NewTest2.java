package listnearsxml2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest2 {
  
	WebDriver driver;
	public static void capturescreen(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		File source=tss.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Listener\\screenshots\\s5.png");
		
		FileHandler.copy(source, destination);
		
		System.out.println("capture screen shot");
	}
}
