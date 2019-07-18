package day9;

import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 Scanner ice = new Scanner(System.in);
 
   int no =5;
   int yes = 10;
   int maybe= 15;
   
   int age = 20;
   String name ="";
   String color="";
   
 System.out.println("hi our name is kai , kya and nya we're known as ice cream what you name?");
   
   name = ice.nextLine();
   
   System.out.println(" so i know that we're diffrent ages but i was wondering whats your age? ");
   
   age =ice.nextInt();
   
   System.out.println(" alright we have your name and age so we have one more question and that question is what is you faforite color?");
   
   color=ice.next();
   
   System.out.println(" okay we have everything so your name is " + name + " and your age is " + age + " and last thing your favorite color is " + color + " Am i right let me know if im wrong");
   
   ice.nextInt();
   
        System.out.println(" welcome"+ name);
   System.out.println(" enter a number");
   
   
   
   
   
   
   
   
	}   
}