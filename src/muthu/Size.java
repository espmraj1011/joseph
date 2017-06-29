package muthu;

import java.io.File;

public class Size {
	public static void main(String[] args){
		File file =new File("D:\\muthuraj\\abc.txt");
		if(file.exists()){

			double bytes = file.length();
			double megabytes = bytes/1024;
			System.out.println("megabytes : " + megabytes);
		}else{
			 System.out.println("File does not exists!");
		}

	}

}
