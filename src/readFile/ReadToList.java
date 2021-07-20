package readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadToList {
	public static List<String> strReader (File in)
	{
	    List<String> totLines = new ArrayList<String>();

	    try
	    {
	        BufferedReader br = new BufferedReader(new FileReader(in));
	        String line;
	        while ((line = br.readLine()) != null)
	        {
	            totLines.add(line);
	        }
	        br.close();
	    }
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    //String result = null;

	    return totLines;
	}
	public static void main(String args []){
//		File in = new File("E:", "a.txt");
//		List <String>lt=strReader(new File("E:", "a.txt"));
//		System.out.println(lt);
		
	}

}
