package listnearsxml2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnearsxml2.NewTest4.class)
public class NewTest3 {
	public static WebDriver driver;
	
	@BeforeClass
	public void initilation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  @Test(priority=1)
  public void entercread() {
	  driver.findElement(By.xpath("//input[@placeholder=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder=\"password\"]")).sendKeys("admin123");
  }
  
  @Test(priority=2)
  public void loginbutton() throws InterruptedException {
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void verifytital() {
	  String exp="Orange";
	  String act=driver.getTitle();
	  
	  System.out.println(act);
	  
	  Assert.assertEquals(act, exp, "tital is equals");
  }
  @AfterClass
  public void teardown() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
  
}
