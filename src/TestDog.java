class Animal{

   public void move(){
      System.out.println("Animals can move");
   }
}

class Dog extends Animal{

   public void move(){
      System.out.println("Dogs can walk and run");
   }
}
class dog2 extends Dog{
	public void move(){
		System.out.println("Dog can bark");
	}
}

public class TestDog{

   public static void main(String args[]){
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object
      Dog d=new dog2();
      
      a.move();// runs the method in Animal class

      b.move();//Runs the method in Dog class
      
      d.move();
      
   }
}