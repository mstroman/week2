package day7;

import java.util.Scanner;

public class thedubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner code = new Scanner(System.in);
		 
		int bye=5;
		int hi=10;
		int back=0;
		String name="";
		String color="";
		
		
		System.out.println("welcome to dubs calculator");
		
		System.out.println("enter your name");
		name =code.next();
		
		System.out.println(" whats your favorite color");
		color =code.next();
		
		System.out.println("enter a number");
		bye = code.nextInt();
	  
		System.out.println("enter a number");
		hi = code.nextInt();
		
		System.out.println("this is the sum");
		back=bye+hi;
		System.out.println(back);
		
		System.out.println("this is the difference");
		back=bye-hi;
		System.out.println(back);
		
		System.out.println("this is the product");
		back=bye*hi;
		System.out.println(back);
		
		System.out.println("this is the quotient");
		back=bye/hi;
		System.out.println(back);
		
		System.out.println(" thank you for partcipating + name ");
		
		
		
	}

}
