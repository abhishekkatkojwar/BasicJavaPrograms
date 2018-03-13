package readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadToHashmap {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader in = new BufferedReader(new FileReader("E:\\a.txt"));
        String line = "";
        while ((line = in.readLine()) != null) {
            String parts[] = line.split("\t");
            map.put(parts[0], parts[1]);
        }
        in.close();
        System.out.println(map.toString());
        }
}