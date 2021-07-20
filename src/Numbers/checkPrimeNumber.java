package Numbers;

public class checkPrimeNumber {
	public static boolean checkPrime(int num){		
		boolean isPrime = true;
		for (int i=2;i <= num/2;i++) {			
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
//		checkPrime(17);
		int num = 34;
	    boolean flag = false;
	    for (int i=2; i <= num / 2; i++) {
	      // condition for nonprime number
	      if (checkPrime(i)) {
	    	  if(checkPrime(num-i)){
	    		  System.out.println(num+"="+i+"+"+(num-i));
	    		  flag = true;
//	    		  break;
	    	  }
	        
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  
	}
}
