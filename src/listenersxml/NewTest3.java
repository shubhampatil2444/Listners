package listenersxml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersxml.NewTest4.class)
public class NewTest3 {
	public static WebDriver driver;
	
	@BeforeTest
	public void initilytion() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test(priority=1)
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	  Thread.sleep(3000);

  }
  @Test(priority=2)
  public void homepage() throws InterruptedException {
	  System.out.println("This is second test case for homepage");
	  Thread.sleep(3000);
	  Assert.assertTrue(false);
  }
}
