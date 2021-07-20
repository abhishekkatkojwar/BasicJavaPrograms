package Numbers;

public class increment {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		a++;
		b++;
		System.out.println("a="+a+" and b="+b);
		int c=++a; // first increment and then assinged.
		int d=b++; // assign first then increment.
		System.out.println("c="+c+" and d="+d);
		System.out.println("a="+a+" and b="+b);

	}

}
