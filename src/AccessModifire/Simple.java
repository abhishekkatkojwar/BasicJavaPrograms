package AccessModifire;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
  
public class Simple{  
	   SoftAssert softas = new SoftAssert(); 
// public static void main(String args[]){  
	   
	   @Test
	   public void assertVal() {
//   A obj=new A();  
//   System.out.println(obj.data);//Compile Time Error  
//   obj.msg();//Compile Time Error  
   
 
   softas.assertNotEquals(2, 2, "values are same");
//   softas.assertEquals("aa","aaccc","asserts exists");  
   softas.assertAll();  
   
   }  
}