import java.util.ArrayList;


public class compairArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 ArrayList<String> Alist= new ArrayList<String>();
		  ArrayList<String> Blist= new ArrayList<String>(); 

		  Alist.add("gsm");
		  Alist.add("tablet");
		  Alist.add("pc");
		  Alist.add("mouse");

		  Blist.add("gsm");
		  Blist.add("something");
		  Blist.add("pc");
		  Blist.add("something");
		  
		  int sizeOfTheShortestList = Math.min(Alist.size(), Blist.size());
		  for (int i=0; i<sizeOfTheShortestList; i++) {
		      if (Blist.get(i).equals(Alist.get(i))) {
		          System.out.println("Equals..: " + Blist.get(i));
		      }
		      else{
		    	  System.out.println("Not Equals");
		      }
		  }

	}

}
