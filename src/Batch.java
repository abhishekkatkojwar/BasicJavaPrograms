import java.text.DecimalFormat;

public class Batch {
 
    public static void main(String args[]){
//        try{
//                System.out.println("Running the batch script");
//                Process proc= Runtime.getRuntime().exec("C:\\Users\\abhishek_katkojwar\\Desktop\\Test.bat");
//                Thread.sleep(10000);
//                System.out.println(proc.exitValue());
//                 
//                System.out.println("Finished running the batch script");
//        }catch(Exception e) {
//            System.out.println("Error creating the FileInfo panel: " +e);
//            e.printStackTrace();
//        }
    	
    	double d = 4.569632;
    	DecimalFormat df = new DecimalFormat("#.##");
    	System.out.println(df.format(d));
    	d=Double.parseDouble(df.format(d));
    	System.out.println(d);
    }
}


