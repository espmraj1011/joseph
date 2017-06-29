package muthu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Add {
	public static void main (String[] args){
		try
			{
			FileWriter fw = new FileWriter("D:\\muthuraj\\but.txt", true);
		    BufferedWriter bw = new BufferedWriter(fw);
			    //more code
		    bw.write("hi India");
		    bw.close();
			    //more code
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
				e.printStackTrace();
			}
	}

}
