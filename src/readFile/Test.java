package readFile;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(final String[] args) throws IOException {
        final Path firstFile = Paths.get("D:\\Delaware\\upload-06142021\\discarded-2-no.csv");
        final Path secondFile = Paths.get("D:\\Delaware\\upload-06142021\\mainframe-notopened-No.csv");
//        final Path secondFile = Paths.get("D:\\Delaware\\upload-06142021\\Sagitec-emails-unopened-6-10-1021.csv");
//        final Path secondFile = Paths.get("D:\\Delaware\\upload-06142021\\MasterCopyNO.csv");
        final List<String> firstFileContent = Files.readAllLines(firstFile,
            Charset.defaultCharset());
        final List<String> secondFileContent = Files.readAllLines(secondFile,
            Charset.defaultCharset());

        System.out.println(diffFiles(firstFileContent, secondFileContent));
//        System.out.println(diffFiles(secondFileContent, firstFileContent));
        List<String> diffFiles=diffFiles(firstFileContent, secondFileContent);
        System.out.println(firstFileContent.size());
        System.out.println(secondFileContent.size());
        System.out.println(diffFiles.size());
    }

    private static List<String> diffFiles(final List<String> firstFileContent,
        final List<String> secondFileContent) {
        final List<String> diff = new ArrayList<String>();
        int i=0;
        for (final String line : firstFileContent) {
        	i=i+1;
//        	System.out.println("checking "+i+"th time "+line);
            if (secondFileContent.contains(line)) {
                diff.add(line);
            }
        }
        return diff;
    }
}