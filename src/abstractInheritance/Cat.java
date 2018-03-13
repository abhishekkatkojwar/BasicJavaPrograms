package abstractInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
	void speak(){
		System.out.println("cat mau");
	}
	
	void blabla(){
		System.out.println("blabla");
	}
	
	public static void main(String args[]){
		
		Animal c = new Cat();
//		c.blabla();
		
		List a = new ArrayList();
		
//		ArrayList b = new ArrayList();
	}
	
	
}