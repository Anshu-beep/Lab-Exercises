package day2;
import java.util.*;
public class Lab1Ex7 
{
	static boolean cehckNumber(int n)
	//Number is increasing or not
	{
		int remA,remB;
		while(n!=0)
		{
			remA=n%10;
			n=n/10;
			remB=n%10;
			n=n/10;
			if(remA>remB) 
				{
					return true;
				}
			else
			{
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
		int n;
		boolean b;
		n=scan.nextInt();
		b=cehckNumber(n);
		System.out.println(b);
	}
}
