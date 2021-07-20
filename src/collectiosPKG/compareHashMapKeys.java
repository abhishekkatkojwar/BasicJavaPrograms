package collectiosPKG;
import java.util.*;
public class compareHashMapKeys {
	public static void main(String[] args)
	{

		// New HashMap1
		HashMap<String, String> map1 = new HashMap<String, String>();

		// Add Entry to map
		map1.put("1", "Akshay");
		map1.put("2", "Bina");
		map1.put("3", "Chintu");
		
		System.out.println(map1);

		// New HashMap2
		HashMap<String, String> map2 = new HashMap<String, String>();

		// Add Entry to map
		map2.put("3", "Chintu");
		map2.put("2", "Bina");
		map2.put("1", "Akshay");

		// New HashMap3
		HashMap<String, String> map3 = new HashMap<String, String>();

		// Add Entry to map
		map3.put("1", "Akshay");
		map3.put("2", "Binod");
		map3.put("4", "Chintu");

		// Compare map1 and map2 keys using keySet() and
		// equals() method
		System.out.println(
			"map1 keys == map2 keys : "
			+ map1.keySet().equals(map2.keySet()));

		// Compare map1 and map3 keys using keySet() and
		// equals() method
		System.out.println(
			"map1 keys == map3 keys : "
			+ map1.keySet().equals(map3.keySet()));
	}
}
