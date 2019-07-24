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
   String answer="";
   
   System.out.println("hi our name is kai , kya and nya we're known as ice cream what you name?");
   name = ice.nextLine();
  
  System.out.println(" so i know that we're diffrent ages but i was wondering whats your age? ");
   age =ice.nextInt();
  
  System.out.println(" alright we have your name and age so we have one more question and that question is what is you faforite color?");
  color=ice.next();
  
  System.out.println(" okay we have everything so your name is " + name + " and your age is " + age + " and last thing your favorite color is " + color + " is this information correct?");
   answer=ice.next();
   
   if(answer.equalsIgnoreCase("yes")) {
	   System.out.println("Here's are calculator");
	  
	   System.out.println("welcome + name");
	   System.out.println("enter an number");
	   no=ice.nextInt();
	   
	   System.out.println("enter another number");
	   yes=ice.nextInt();
	   
	   System.out.println("here's you answer");
	   maybe=no+yes;
	   System.out.println(maybe);
	   
	   System.out.println("enter a number");
	   no=ice.nextInt();
	   
	   System.out.println("enter another number");
	   yes=ice.nextInt();
	   
	   System.out.println(" here's your number");
	   maybe=no-yes;
	   System.out.println(maybe);
	   
   }else {
   
 System.out.println("well since i got something wrong the first time lets try again whats your name");
    name = ice.nextLine();
   
   System.out.println(" whats your age? ");
    age =ice.nextInt();
   
   System.out.println(" what is you faforite color?");
   color=ice.next();
   
   System.out.println(" okay we have everything so your name is " + name + " and your age is " + age + " and last thing your favorite color is " + color + " is this information correct?");
    answer=ice.next();
   }
	if(answer.equalsIgnoreCase("okay")) {
		System.out.println(" here's are calculator");
   
   System.out.println("welcome" + name);
   System.out.println("enter an number");
   no=ice.nextInt();
   
   System.out.println("enter another number");
   yes=ice.nextInt();
   
   System.out.println("here's you answer");
   maybe=no+yes;
   System.out.println(maybe);
   
   System.out.println("enter a number");
   no=ice.nextInt();
   
   System.out.println("enter another number");
   yes=ice.nextInt();
   
   System.out.println(" here's your number");
   maybe=no-yes;
   System.out.println(maybe);
   
   System.out.println(" here's your number");
   maybe=no*yes;
   System.out.println(maybe);
   
   System.out.println(" here's your number");
   maybe=no/yes;
   System.out.println(maybe);
   
	}else{
		System.out.println();
		
	}
	// the other program
	System.out.println(" do you want to leave the program");
	ice.next();
	System.out.println(" goodbye have a nice day");
}
}
       
