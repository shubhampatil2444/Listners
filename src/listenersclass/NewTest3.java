package listenersclass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersclass.NewTest4.class)
public class NewTest3 {
	
  @Test(priority=1)
  public void button() {
	  System.out.println("button");
	  Assert.assertFalse(true);
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("login");
  }
  @Test(dependsOnMethods="button")
  public void homepage() {
	  System.out.println("homepage");
	  
  }
}
