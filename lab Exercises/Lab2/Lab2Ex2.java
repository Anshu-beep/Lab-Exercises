package day2;
import java.util.*;
public class Lab2Ex2 {
	static String[] sortString(String strArr[]) 
	{
		Arrays.sort(strArr);
		if(strArr.length%2==0)
		{
			for(int i=0;i<(strArr.length)/2;i++)
			{
				System.out.println(strArr[i].toUpperCase());
			}
			for(int i=((strArr.length)/2);i<strArr.length;i++)
			{
				System.out.println(strArr[i].toLowerCase());
			}
			return strArr ;
		}
		else
		{
			for(int i=0;i<((strArr.length)/2)+1;i++)
			{
				System.out.println(strArr[i].toUpperCase());
			}
			for(int i=((strArr.length)/2)+1;i<strArr.length;i++)
			{
				System.out.println(strArr[i].toLowerCase());
			}
			return strArr ;
		}
		
	}
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		String[] strArr=new String[n];
		System.out.println("Enter elements of an array");
		for(int i=0;i<n;i++)
		{
			strArr[i]=scan.next();
		}
		sortString(strArr);
		scan.close();
	}
}
