package Day5;
//Create a method which accepts an array of integer elements and return the second smallest element in the array

import java.util.*;

public class Lab6Ex5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the length of an array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			}
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}
