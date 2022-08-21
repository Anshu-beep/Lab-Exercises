package Day3;
/*Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 */
import java.util.Scanner;

public class Lab5Ex2 {
	public static void main(String[] args) throws Exception
	{
		try{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first Name");
			String firstName=scan.next();
			System.out.println("Enter last Name");
			String lastName=scan.next();
			if(firstName==null && lastName==null) 
				{
				throw new Exception("User name is not appropriate");
				}
			else 
				{
				System.out.println("User name is: "+firstName+" "+lastName);
				}
			}
			catch(Exception e)
				{
					e.printStackTrace();
				}
	}
}
