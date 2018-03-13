interface Q{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class W implements Q{  
public void c(){System.out.println("I am C");}  
}  
  
class M extends W{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class abstarctionTest{  
public static void main(String args[]){  
Q a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}