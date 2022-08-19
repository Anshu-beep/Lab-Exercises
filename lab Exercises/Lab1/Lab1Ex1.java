package day2;
import java.util.*;

public class Lab1Ex1 {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in); 
		int num;
		num=scan.nextInt();
		int a,b,sum=0;
		while(num!=0)
		{
			a=num%10;
			num=num/10;
			//System.out.println(n);
			b=(int) Math.pow(a, 3);
			sum=sum+b;
		}
		System.out.println(sum);
	}
}