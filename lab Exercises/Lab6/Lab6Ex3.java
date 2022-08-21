package Day5;
//Create a method which accepts an array of numbers and returns the numbers and their squares in HashMap
import java.util.*;
public class Lab6Ex3 {
	 static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer,Integer> map1=new HashMap<>();
		int[] sqrArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			sqrArr[i]=arr[i]*arr[i];
			map1.put(arr[i], sqrArr[i]);
		}
		return map1;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(getSquares(arr));
	}
}
