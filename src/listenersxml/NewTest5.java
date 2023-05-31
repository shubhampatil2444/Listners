package listenersxml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersxml.NewTest6.class)
public class NewTest5 {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void initiliation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test(priority=1)
  public void entercreat() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
	  
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void loginbutton() throws InterruptedException {
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void verifytital() throws InterruptedException {
	  String exp="VCTC";
	  String act=driver.getTitle();
	  
	  System.out.println("actual tital"+ act);
	  Assert.assertEquals(act, exp, "Tital does not mathed");
	  Thread.sleep(2000);
  }
  @AfterClass
  public void TearDowan() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
}
