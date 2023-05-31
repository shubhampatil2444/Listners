package listenersclass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersclass.NewTest2.class)
public class NewTest1 {
  @Test(priority=1)
  public void m1() {
	  System.out.println("Method m1 is passed");
  }
  
  @Test(priority=2)
  public void m2() {
	  System.out.println("method m2 is failed");
	  Assert.assertFalse(true);
  }
  
  @Test(dependsOnMethods="m2",priority=3)
  public void m3() {
	  
	  System.out.println("method m3 is skipped");
  }
}
