package day2;
import java.util.*;
public class Lab1Ex5 {
	static void calculateSum(int n)
	{
		int sum=0,i;
		for(i=1;i<=n;i++) 
		{
			if(i%3==0 || i%5==0)
				{
					sum=sum+i;
				}
		}

		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		calculateSum(n);
	}
}
