package collectiosPKG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList
{
    public static void main( String[] args )
    {
    	System.out.println("Set values .....");
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        
        for (String temp : set){
        	System.out.println(temp);
        }
        
        System.out.println("List values .....");
    	List<String> list = new ArrayList<String>(set);
        
        for (String temp : list){
        	System.out.println(temp);
        }
    }
}