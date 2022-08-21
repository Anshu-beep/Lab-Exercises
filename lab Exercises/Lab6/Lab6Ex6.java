package Day5;
//input a map with IDs and their ages and return they eligible or not for voting (age>=18) all eligible IDs as a list

import java.util.*;
import java.util.Map.Entry;
public class Lab6Ex6 {
	static String voterList(Map<Integer,Integer> map) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Entry<Integer,Integer>> entries=map.entrySet();
		for(Entry<Integer,Integer> entry: entries) {
			if(entry.getValue()>=18) {
				list.add(entry.getKey());
			}
		}
		return list.toString();
	}
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of people you want to add: ");
		int n=scan.nextInt();
		for (int i=0;i<n;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			map.put(a, b);
		}
		System.out.println(voterList(map));
	}
}
