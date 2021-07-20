package Threads;

public class B extends Thread {

	public void run() {
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.println(" Thread name = "+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		B t1 = new B();
		t1.start();

		B t2 = new B();
		t2.start();

		B t3 = new B();
		t3.start();
	}
}