package collectiosPKG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CconvertListToSet {
	public static void main(String[] args) {
	      List l = new ArrayList();
	      l.add("Good");
	      l.add("Morning");
	      l.add("Morning");
	      Set s = new HashSet(l);
	      System.out.println(l);
	      System.out.println(s);
	   }
}
