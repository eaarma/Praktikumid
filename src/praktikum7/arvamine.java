import java.util.Scanner;

public class arvamine {

	  public static void main(String args[])
	  {
	   Scanner keyboard = new Scanner(System.in);

	   int a = 1 + (int) (Math.random() * 99);
	   int guess;

	   System.out.println("Pead arvama ära arvu, mis on ühest sajani");
	   guess = keyboard.nextInt();

	   while(guess != a){
	   if (guess > a)
	   {  
	     System.out.println("Vähem vaja");

	   }
	   else if (guess < a) 
	   {
	    System.out.println("Rohkem vaja");

	   }
	   else 
	   {
	     System.out.println("Õige arv");
	   }
	   }
	  }
	}
}
