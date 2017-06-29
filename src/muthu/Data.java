package muthu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {
	public static void main(String[] ags){
		
		String line;
		try {
			BufferedReader in = new BufferedReader(new FileReader("D:\\muthuraj\\abc.txt"));
			while((line = in.readLine())!= null){
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
