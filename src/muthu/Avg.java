package muthu;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) 
	{
    int a, b, c, d, e, f, total=0, avg=0, x=0, y=0, z=0, w=0, cut_off1=0, cut_off2=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Marks scored in Tamil");
	a=s.nextInt();
	System.out.println("Marks scored in English");
	b=s.nextInt();
	System.out.println("Marks scored in Mathematics");
	c=s.nextInt();
	System.out.println("Marks scored in Physics");
	d=s.nextInt();
	System.out.println("Marks scored in Chemistry");
	e=s.nextInt();
	System.out.println("Marks scored in Boilogy");
	f=s.nextInt();
	total=a+b+c+d+e+f;
	System.out.println("Total: "+total);
	avg=total/6;
	System.out.println("Average: "+avg);
	x=d/4;
	y=e/4;
	z=f/2;
	w=c/2;
	cut_off1=x+y+z;
	System.out.println("Medical cut off: "+cut_off1);
	cut_off2=x+y+w;
	System.out.println("Engineering cut off: "+cut_off2);
	}
}
