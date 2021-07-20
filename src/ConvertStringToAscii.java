import java.util.ArrayList;
import java.util.List;

public class ConvertStringToAscii {  
    public static void main(String args[]) {  
      
        String test = "ABC123D473dfghdfghEFZaz"; 
        int j=0;
//        char []arr1=new char();
        List<Character> list1 = new ArrayList<Character>();


        for ( int i = 0; i < test.length(); ++i ) {  
            char c = test.charAt( i );  
            int charCode = c; 
            System.out.println("ASCII value of " + c +" is on the "+i+" place: " + charCode);  
            if(((charCode<91)&&(charCode>64))||((charCode<123)&&(charCode>96))){
            	list1.add(c);
            	j++;
            }
        } 
        for(char c1 : list1)
        	System.out.print(c1+" ");
        //if we store the charactor into the intiger then it save the ascii value of that charator. 
        int charCode = 'Z';
        System.out.println("char code"+charCode);
    }  
}  