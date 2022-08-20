package Day1;
//Lab3Ex1- reads a line of integers and then displays each integer and the sum of all integers(using tokenizer)

import java.util.*;
public class Tokenizer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		str=scan.nextLine();
		String arr[]=str.split(" ", 0);
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int a=Integer.parseInt(arr[i]);
			sum=sum+a;
		}
		System.out.println("Sum of integers: "+sum);
		scan.close();
	}
}
