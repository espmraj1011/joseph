package muthu;

import java.io.File;

public class Move {
	public static void main(String[] args){

    	   File afile =new File("D:\\esp\\but.txt");

    	   if(afile.renameTo(new File("D:\\muthuraj\\" + afile.getName()))){
    		System.out.println("File is moved successful");
    	   }else{
       		System.out.println("File is failed to move");
       	   }
       	}
	}
