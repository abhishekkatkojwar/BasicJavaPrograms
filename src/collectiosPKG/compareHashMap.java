package collectiosPKG;
import java.util.*;

public class compareHashMap {
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
		map3.put(1, "Bina");
		map3.put(2, "Akshay");
		map3.put(3, "Chintu");

		// Compare map1 and map2
		System.out.println("map1 == map2 : "
						+ map1.equals(map2));

		// Compare map1 and map3
		System.out.println("map1 == map3 : "
						+ map1.equals(map3));
	}
}
