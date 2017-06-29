package muthu;

import java.util.Scanner;

public class sqre {
	public static void main(String[] args) 
	{
    int a, b, c=0, result=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any two numbers :");
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	result=c*c;
	System.out.println("Result: "+result);
	}

}
