package listnearsxml2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnearsxml2.class1.class)
public class NewTest1 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void initilation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test(priority=1)
  public void entercread() {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	  
  }
  @Test(priority=2)
  public void button() throws InterruptedException {
	  driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	  
	  //Thread.sleep(2000);
	  
  }
  @Test(priority=3)
  public void verifyname() {
	  String exp="OrangeHRM";
	  String act=driver.getTitle();
	  
	  Assert.assertTrue(false);
	  System.out.println("actule name"+ act);
  }
  @AfterClass
  public void TearDowan() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
