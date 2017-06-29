package muthu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Rename {
	public static void main (String[] ags){
		Path source = Paths.get("D:\\muthuraj\\abc.txt");
		try {
			Files.move(source, source.resolveSibling("but"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
