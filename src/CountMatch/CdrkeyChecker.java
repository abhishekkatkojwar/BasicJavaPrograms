/**
 * 
 */
package CountMatch;

import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author tushar_pawar
 *
 */
public class CdrkeyChecker {

	private static String finalPath= "D:/V4-report-Test/CountMatch/";
	
	private final String tempFileName = "CDRwith3Parameters-numberInserted.txt";
	private static String path = "D:/V4-report-Test/CountMatch/";
	
	
	private ConcurrentMap<String, ConcurrentMap<Integer, String>> finalCdrkeyChecker = new ConcurrentHashMap<String, ConcurrentMap<Integer, String>>();
	
	public CdrkeyChecker() {
		super();
		finalPath = "";
	}
	
	public CdrkeyChecker(String path) {
		this.finalPath = path;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		CdrkeyChecker cdrkeyChecker = null;
		
		try {
			
			boolean isPathEntered = false;
			
			if(path.length() > 0) {
				
				if(path.length() != 0) {
					char[] ch = path.toCharArray();
					if(ch[ch.length-1] != '/')
						cdrkeyChecker = new CdrkeyChecker(path.concat("/"));
					else
						cdrkeyChecker = new CdrkeyChecker(path);
					isPathEntered = true;
				}	
			}
			
			if(!isPathEntered) {
				Path currentRelativePath = Paths.get("");
				String s = currentRelativePath.toAbsolutePath().toString();
				System.out.println("Automatically fetched current path [" + s + "]");
				cdrkeyChecker = new CdrkeyChecker(s.concat("/"));
			}
			
			cdrkeyChecker.startCdrkeyChcecker(cdrkeyChecker);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private void startCdrkeyChcecker(CdrkeyChecker cdrkeyChecker) {

		try {
			
			List<String> invalidLinesContent = new ArrayList<String>();
			
			String filename  = finalPath.concat(tempFileName);
			RandomAccessFile fileAccessor = new RandomAccessFile(filename, "rw");
			
			String data = "";
			
			while((data = fileAccessor.readLine()) != null) {
				
				if(data.contains("::")) {
					System.out.println("data contains :: ");
					String[] splittedData = data.split("::");
					System.out.println("***"+splittedData[0]);
					if(splittedData.length > 0 && splittedData[0] != null && !"".equalsIgnoreCase(splittedData[0])) {
						if(!addEntryToStructure(splittedData[0], data))
							invalidLinesContent.add(data);
					} else {
						invalidLinesContent.add(data);
					}
				} else {
					invalidLinesContent.add(data);
				}
			}
			
			fileAccessor.close();
			
			if(processCdrkeyChecker(filename, invalidLinesContent)) {
				System.out.println("Successfully process the file [" + filename + "]");
			} else {
				System.out.println("Error occurres while processing the file [" + filename + "]");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean processCdrkeyChecker(String filename, List<String> invalidLinesContent) {
		
		List<String> validLines = new ArrayList<>();
		List<String> invalidLines = new ArrayList<>();
				
		if(invalidLinesContent != null && invalidLinesContent.size() > 0) {
			writeInvalidFileContent(invalidLinesContent);
		}
		
		int singleCdrkey = 0;
		int twoCdrkey = 0;
		int multipleCdrkey = 0;
		int threeCdrkey = 0;
		
		
		for(Map.Entry<String, ConcurrentMap<Integer, String>> checker : finalCdrkeyChecker.entrySet()) {
			
			if(checker.getValue().size() > 2) {
				if(checker.getValue().size() == 3) {
					if(checker.getValue().size() == 3) {
						threeCdrkey+=1;
					}
				} else {
					checker.getValue().forEach((k,v) -> invalidLines.add(v));
					multipleCdrkey = multipleCdrkey + 1;
				}
				
			} else {
				
				if(checker.getValue().size() == 1) {
					singleCdrkey = singleCdrkey + 1;
				} else {
					twoCdrkey = twoCdrkey + 1;
				}
				checker.getValue().forEach((k,v) -> validLines.add(v));
			}
		}

		System.out.println("No of Single cdrkey [" + singleCdrkey + "]");
		System.out.println("No of Two cdrkey [" + twoCdrkey + "]");
		System.out.println("No of Three cdrkey [" + threeCdrkey + "]");
		System.out.println("More then two cdrKey [" + multipleCdrkey + "]");
		
		
		if(writeValidContent(validLines)) {
			if(writeInvalidFileContent(invalidLines)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean writeValidContent(List<String> validLines) {
		
		String filename = finalPath.concat("valid-cdrkey-").concat(tempFileName);
		
		try {
			Files.write(Paths.get(filename),
					validLines,
	                StandardCharsets.UTF_8,
	                StandardOpenOption.CREATE,
	                StandardOpenOption.APPEND);
			
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	private boolean addEntryToStructure(String cdrKey, String data) {
		
		if(finalCdrkeyChecker.isEmpty()) {
			ConcurrentMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
			map.put(1, data);
			finalCdrkeyChecker.put(cdrKey, map);
		} else if(finalCdrkeyChecker.containsKey(cdrKey)) {
			ConcurrentMap<Integer, String> map = finalCdrkeyChecker.get(cdrKey);
			map.put(map.size()+1, data);
			finalCdrkeyChecker.put(cdrKey, map);
		} else {
			ConcurrentMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
			map.put(1, data);
			finalCdrkeyChecker.put(cdrKey, map);
		}
		
		return true;
	}

	
	
	private boolean writeInvalidFileContent(List<String> invalidLinesContent) {
		
		String filename = finalPath.concat("invalid-content-").concat(tempFileName);
		
		try {
			Files.write(Paths.get(filename),
					invalidLinesContent,
	                StandardCharsets.UTF_8,
	                StandardOpenOption.CREATE,
	                StandardOpenOption.APPEND);
			
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
