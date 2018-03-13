package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firstTestNG {
	public WebDriver driver = new FirefoxDriver();
    public String baseUrl = "http://newtours.demoaut.com";
//    public String expectedTitle = "Welcome: Mercury Tours";
//    public String actualTitle = "";
  @Test(threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
  public void f() {
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = "";
	  actualTitle = driver.getTitle();
	  if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
      
      //close Firefox
      driver.close();
      driver.quit();
      // exit the program explicitly
      System.exit(0);
  }
}
