
class a1{
	public void add(){
		System.out.println("This is Kunal");
	}
}
class b1 extends a1{
	public void add(){
		System.out.println("Test");
	}
	public void sub(){
		System.out.println("sub");
	}
	
}
public class test_abc extends b1 {
	public void test(){
		System.out.println("test in c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1 c=new a1();
//		c.sub();
		c.add();

	}

}
