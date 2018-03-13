public class testConverTimeSecToMin {
	public static void main(String[] args) {
		String min=timeConversion(5,652);
		
		System.out.println(min);
		double a1=Double.parseDouble(min);
		System.out.println(a1);
		double avg=a1/4;
	}
	public static String timeConversion(int min, int totalSeconds) {

	    final int MINUTES_IN_AN_HOUR = 60;
	    final int SECONDS_IN_A_MINUTE = 60;
	    totalSeconds=totalSeconds+min*60;
	    int seconds = totalSeconds % SECONDS_IN_A_MINUTE; 
	    System.out.println("seconds="+seconds);
	    int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
	    System.out.println(totalMinutes);


	    return  totalMinutes+"."+seconds;
	}

}