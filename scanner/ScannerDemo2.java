/*
* Program Name: ScannerDemo2
* Purpose: shows how to create and use a Scanner object to read input
           from the keyboard. 
		   REVISION: changed the next() method to nextLine() so that we can
		             read multiple words from the keyboard.
* Coder: Bill Pulling for Sec02
* Date: Wed Sept 11, 2019
*/
import java.util.Scanner;//we'retelling the interpreter where to find the
                         // code to build a Scanner object.
public class ScannerDemo2
{
	public static void main(String[]args)
	{
		//Step 1: create or INSTANTIATE  a Scanner object
		Scanner input = new Scanner(System.in);//here we are building an object
							//NOTE:the System.in object is used as an ARGUMENT
							// to build a much more powerful Scanner object
		//Step 2: PROMPT the user
		//NOTE: we usually use print() for prompts.
		System.out.print("Enter your full name and press ENTER:");//the 'prompt'
		
		//Step 3:
		//REVISION: changed the next() method to nextLine()
		
		String name = input.nextLine();//reads the keyboard buffer, INCLUDING spaces
		
		//output
		System.out.println("Your name is " + name);
		
		
	}//end of main	
	 
}//end of class