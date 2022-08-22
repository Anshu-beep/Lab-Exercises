package Day5;
//create a method which accepts an int array and reverse number and print array in sorted manner
import java.util.*;

public class Lab6Ex7 {
	static int[] getSorted(int[] arr)
	{
		int[] arr2= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			String str2=String.valueOf(arr[i]);
			StringBuffer sb=new StringBuffer(str2);
			sb.reverse();
			String str3=sb.toString();
			int a=Integer.parseInt(str3);
			arr2[i]=a;
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the number");
			arr[i]=scan.nextInt();
		}
		getSorted(arr);
		scan.close();
	}
}
