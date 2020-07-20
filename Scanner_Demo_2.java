/*
* Program Name: Scanner_Demo_2
* Purpose: shows how to use of next line method to read mutliple words
* Coder: Dianne Corpuz 955976
* Date: September 10, 2019
*/
import java.util.Scanner;
public class Scanner_Demo_2
{
	public static void main(String[]args)
	{	
		//Scanner
		Scanner sn=new Scanner(System.in);
		System.out.print("\tMy firstname is  ");
		String fullname = sn.next();
		
		sn.nextLine();
		System.out.println("\tWelcome "+ fullname);
		
		System.out.print("\tMy surname is  ");
		String surname = sn.next();
		
		
	}//end main
}//END OF CLASS