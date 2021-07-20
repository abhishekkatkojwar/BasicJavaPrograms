package collectiosPKG;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConvertHashMapToSet {
	public static void main(String[] args) {
		//Creating HashMap
		HashMap<String, String> hMap = new HashMap<String, String>();
		//Putting values in HashMap.
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");
		
		//Creating Set of "Keys" of HashMap (Simple Set)
		Set st = hMap.keySet();
		Iterator itr = st.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

		//Creating HashSet of "Values" of HashMap (HashSet)
		Set <String> vl=new HashSet<String>( hMap.values());
		System.out.println(vl);
		
		Iterator itr1 = vl.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}