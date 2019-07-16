package day7;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner life = new Scanner(System.in);
        int number=10;
        int green=18;
        int red=20;
        String name="";
        
 System.out.println("enter your name");
     name=life.next();

 System.out.println("welcome " +name);
       System.out.println("enter a number");
        green = life.nextInt()
       number = life.nextInt();
         
       System.out.println("enter a number");
       
       
       System.out.println("this is the sum");       
        red=number+green;
        System.out.println(red);
        
        System.out.println(" this is the difference");
		  red = number-green; 
	  System.out.println(red );	
	  
	  System.out.println("this is the product");
	  red = number*green; 
  System.out.println(red );	
  
  System.out.println("this is the quotient");
  red = number/green; 
System.out.println(red );

System.out.println(" thank you for partcipating " + name);

life.close();
        
        
        
        		
        
        
       
        
        
        
        
	
	
	
	
	
	
	
	}

}
