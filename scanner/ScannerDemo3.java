/*
* Program Name: ScannerDemo3
* Purpose: this example will introduce us to the "Scanner Bug", which is not
           a bug, but a "feature". We'll also get introduced to the concept of
		   the RUDE HOUSE GUEST. 
* Coder: Bill Pulling for Sec02
* Date: Wed Sept 11, 2019
*/
import java.util.Scanner;//we'retelling the interpreter where to find the
                         // code to build a Scanner object.
public class ScannerDemo3
{
	public static void main(String[]args)
	{
		//Step 1: create or INSTANTIATE  a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Step 2: PROMPT the user for first name only and use next()
		//NOTE: we usually use print() for prompts.
		System.out.print("Enter your first name and press ENTER:");//the 'prompt'
		
		//Step 3:
		//REVISION: changed the nextLine() method back to next()
		
		String name = input.next();//reads the keyboard buffer, INCLUDING spaces
		
		//output
		System.out.println("Your name is " + name);
		
		//STEP 4: Ask user to enter their home town. 
		// Use nextLine() here in case their home town is more than one word.
		System.out.print("Enter name of your home town and press ENTER: ");
		String hometown = input.nextLine();
		
		//Step 5: output hometown to screen
		System.out.println("Your hometown is " + hometown);
		
		System.out.println("End of program");
		
	}//end of main	
	 
}//end of class