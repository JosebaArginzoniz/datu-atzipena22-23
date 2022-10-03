package dambi;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;


public class Path_Topatu {
	
    public static void findAllFilesInFolder(File folder) {
		for (File file : folder.listFiles()) {
			if (!file.isDirectory()) {
				System.out.println(file.getName());
			} else {
				findAllFilesInFolder(file);
			}
		}
	}
	public static void main(String[] args) throws ParseException {
		File folder = new File("C://Users/arginzoniz.joseba/Pictures/Camera Roll");
		findAllFilesInFolder(folder);
	}
}

/*https://www.delftstack.com/es/howto/java/how-to-read-files-from-a-folder-in-java/*/



