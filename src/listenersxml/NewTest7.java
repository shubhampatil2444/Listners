package listenersxml;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest7 {
  
	WebDriver driver;
  public static void capturescreen(WebDriver driver,String name) throws IOException {
	  
	  TakesScreenshot tss=(TakesScreenshot)driver;
	  
	  File Source=tss.getScreenshotAs(OutputType.FILE);
	  
	  File Path=new File("C:\\Users\\Admin\\eclipse-workspace\\Listener\\screenshots\\hi12.jpg");
	  
	  FileHandler.copy(Source,Path);
	  
	  System.out.println("capture screen shor succecssfuly");
  }
}
