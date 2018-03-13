import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadCVS {

  public static void main(String[] args) {

	ReadCVS obj = new ReadCVS();
	obj.run();

  }

  public void run() {

	String csvFile = "C:\\Users\\abhishek_katkojwar\\Desktop\\1.txt";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\abhishek_katkojwar\\Downloads\\SYKES_Administration_Billing_History_superadmin_November_3_2015_4-31_PM.csv", "rw");
		raf.seek(0);
		System.out.println("" + raf.readLine());
		System.out.println(raf.getFilePointer());
		int potition=(int) raf.getFilePointer();
		raf.seek(potition-1);
		raf.writeBytes(",abhishek\r\n");
		
		

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
  }

}