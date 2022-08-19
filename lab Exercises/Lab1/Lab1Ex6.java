package day2;
import java.util.*;
public class Lab1Ex6 {
static int calculateSumOfSquare(int n)
{
	int sumS=0,i;
	for(i=1;i<=n;i++)
	{
		sumS=sumS+(i*i);
	}
	return sumS;
}
static int calculateSum(int n)
{
	int sum=0,i;
	for(i=1;i<=n;i++)
	{
		sum=sum+(i);
	}
	return sum;
	
}
public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n,b,c,d;
		n=scan.nextInt();
		b=calculateSumOfSquare(n);
		c=calculateSum(n);
		d=b-c;
		System.out.println(d);
	}
}
