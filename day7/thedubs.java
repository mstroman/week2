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
		int be1=2;
		
		System.out.println("welcome to dubs calculator");
		
		System.out.println("enter your name");
		name =code.next();
		
		System.out.println(" whats your favorite color");
		color =code.next();
		
		System.out.println("enter a number");
		bye = code.nextInt();
	  
		System.out.println("enter a number");
		hi = code.nextInt();
		
		back=bye+hi;
		System.out.println("this is the sum " + back);
	
	
		back=bye-hi;
		System.out.println("this is the difference " +back);
		
		
		back=bye*hi;
		System.out.println("this is the product " + back);
		
		
		back=bye/hi;
		System.out.println("this is the quotient " + back );
		
		
		
		System.out.println(" thank you for partcipating " + name + " please rate the calculator on a scale of 1-5");
		be1=code.nextInt();
		System.out.println(" thank you " + name +" for rating dubs calculator a " + be1 );
		
		
		code.close();
		
		
	}

}
