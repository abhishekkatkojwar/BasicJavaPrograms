import java.util.ArrayList;



public class MyFirstJavaProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		ArrayList<String> nums= new ArrayList<String>();
		nums.add("one");
		nums.add("two");
		for(int i=0; i<nums.size();i++)
		System.out.println(nums.get(i));
		
		for (String s : nums)
			System.out.println(s);
		
		for (String s : nums)
		{
		    int i = nums.indexOf(s);
		    System.out.println("Item " + i + ": " + s);
		}
		nums.set(1, "Uno");	
		for (String s : nums)
			System.out.println(s);
	}

}
