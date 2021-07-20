import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class forLoop {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<5; i++)
//		{
//			for(int j=4; j>i; j--)
//				System.out.print(j+" ");
//			System.out.println();
//		}
        String pattern = "dd/MM/yyyy";
        String dateInString =new SimpleDateFormat(pattern).format(new Date());
		System.out.println("Today date is == "+dateInString);
		double cal=2060;
		System.out.println(cal/1000);
	}

}
