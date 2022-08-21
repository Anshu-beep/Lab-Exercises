package Day3;
//Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
import java.util.*;

public class Lab5Ex1 {
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<15) {
			throw new Exception("age is less than 15");
		}
		else {
			System.out.println("age is greater than 15");
		}
		scan.close();
	}
}
