/*
* Program Name: Change_Line_Demo_1
* Purpose: shows how to use command lines argument
* Coder: Dianne Corpuz 955976
* Date: September 10, 2019
*/
import java.util.Scanner;
public class Change_Line_Demo_1
{
	public static void main(String[]args)
	{	
		//Scanner
		Scanner sn=new Scanner(System.in);
		System.out.print("\tMy firstname is  ");
		String f = sn.nextLine();
		
		System.out.print("\tMy middlename is  ");
		String i = sn.nextLine();
		
		System.out.print("\tMy lastname is  ");
		String l = sn.nextLine();
		
		System.out.println("\tWelcome "+ f+" "+i+ " "+l+ " !");
		
		for(int d=0; d<=20; d++){System.out.print("\t*");}System.out.println("");
		
		
		
		System.out.print("\tMy age is  ");
		int o = sn.nextInt();
		
		
		
		if (o<0){
			System.out.println("\tIncorrect age!");
			
			}
			else{
			System.out.println("\tYour age "+o);
			System.out.println("\tYou type your age right!, "+f);
			
			
			System.out.print("\tMy salary is  ");
			double sal = sn.nextDouble();
			System.out.println("\tYour salary is $ , "+sal);
			
			}
		do 
		{
		
			
			
		}
		while (o>0);
		
			
		
		

		//Args
		/* System.out.println("My name is  "+ args[0]);
		System.out.println("My age is  "+ args[1]);
		System.out.println("My hometown is  "+ args[2]);
		 */
	}//end main
}//END OF CLASS