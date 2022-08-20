package Day1;
/*Create a method that accepts a String and checks if it is a positive string.
 * A string is considered a positive string, 
 * if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */
import java.util.*;

public class Lab3Ex8 {
	 static boolean positiveString(String str) 
	 {
		 boolean z;
		StringBuffer sb=new StringBuffer(str);
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int a=sb.charAt(i);
			int b=sb.charAt(i+1);
			if(a> b)
				{
					count=count+1;
				}
			else 
				{
					count=count+0;
				}
		}
		if(count>0) 
			{z=false;
			System.out.println(z);
			return false;}
		else 
			{z=true;
			System.out.println(z);
			return true;}
		
	 }
	 
	 public static void main(String[] args)
	 {
		 Scanner scan=new Scanner(System.in);
			System.out.println("Enter your String: ");
			String str=scan.nextLine();
			positiveString(str);
			scan.close();
			
	 }
}
