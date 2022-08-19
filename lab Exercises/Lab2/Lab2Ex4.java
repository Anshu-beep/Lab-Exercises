package Day1;

//remove duplicates and print array in descending order

import java.util.*;
public class Lab2Ex4 {
	static int[] modifyArray(int[] arr) 
	{
		//storing single value in new array temp
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]!=arr[i+1]) 
				{
					temp[j]=arr[i];
					j=j+1;
				}
		}
		temp[j++] = arr[arr.length-1];//in previous loop we are not accesing last value so we putting in the last temp array
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		// now we are reversing ascending order to get descending order
		int[] temp1 = new int[temp.length];
		int k=0;
		for(int i=temp.length-1;i>=0;i--)
		{
			temp1[k]=temp[i];
			k=k+1;
		}
		System.out.println(Arrays.toString(temp1));
		return temp1;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();		
		}
		modifyArray(arr);
		scan.close();
	}
}
