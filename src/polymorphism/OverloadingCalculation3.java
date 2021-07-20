package polymorphism;

class OverloadingCalculation3 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		long c=a+b;
		System.out.println("b method invoked="+c);
	}

	public static void main(String args[]) {
		OverloadingCalculation3 obj = new OverloadingCalculation3();
		obj.sum(20l, 20);// if obj.sum(20, 20); then it will be ambiguity
	}
}