import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorDemo {

   public static void main(String args[]) {
      // Create an array list
	   List<String> al = new ArrayList<String>();
      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");

      // Use iterator to display contents of al
      System.out.print("Original contents of al: ");
      Iterator<String> itr = al.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();
   }
}