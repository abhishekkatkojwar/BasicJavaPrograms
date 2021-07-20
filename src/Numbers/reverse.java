package Numbers;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int no, rev=0, r, a;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
//		a=no;
		while(no>0){
			r=no%10; //System.out.println("r=="+r);
			rev=rev*10+r;
			no=no/10;
		}
		System.out.println("Reverse: "+rev);

	}

}
