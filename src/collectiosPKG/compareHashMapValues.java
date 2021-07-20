package collectiosPKG;
import java.util.*;

public class compareHashMapValues {
	public static void main(String[] args)
	{
		// New HashMap1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		// Add Entry to map
		map1.put(1, "Akshay");
		map1.put(2, "Bina");
		map1.put(3, "Chintu");

		// New HashMap2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		// Add Entry to map
		map2.put(3, "Chintu");
		map2.put(2, "Bina");
		map2.put(1, "Akshay");

		// New HashMap3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		// Add Entry to map
		map3.put(1, "Chintu");
		map3.put(2, "Bina");
		map3.put(4, "Akshay");

		// Value set of map1
		HashSet<String> set1 = new HashSet<String>(map1.values());
		System.out.println(set1);
		
		// Value set of map2
		HashSet<String> set2 = new HashSet<String>(map2.values());
		System.out.println(set2);

		// Value set of map3
		HashSet<String> set3 = new HashSet<String>(map3.values());
		System.out.println(set3);

		// Compare map1 and map2 values using equals()
		// method
		System.out.println("map1 values == map2 values : "
						+ set1.equals(set2));

		// Compare map1 and map3 values using equals()
		// method
		System.out.println("map1 values == map3 values : "
						+ set1.equals(set3));
		
		System.out.println( new HashSet<>( map1.values() ).equals(new HashSet<>( map2.values() )) );
		System.out.println( new HashSet<>( map1.values() ).equals(new HashSet<>( map3.values() )) ); 
	}
}
