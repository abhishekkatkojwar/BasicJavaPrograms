package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
String message = "Manish";
MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Manish";
      Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test(dependsOnMethods = { "initEnvironmentTest" })
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manish";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }

   @Test
   public void initEnvironmentTest() {
	   Assert.assertEquals("one", "onwe");
      System.out.println("This is initEnvironmentTest");
   }
}