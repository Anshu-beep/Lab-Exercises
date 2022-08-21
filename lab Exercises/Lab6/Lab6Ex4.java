package Day5;
//according to number return the medal name
import java.util.*;
import java.util.Map.Entry;
public class Lab6Ex4 
{
	static Map<Integer,String >getStudents(Map<Integer,Integer> map)
	{
		Map<Integer, String> map1=new HashMap<>();
		Set<Entry<Integer, Integer>> entries = map.entrySet();
		for(Entry<Integer, Integer> entry : entries) 
		{
			if(entry.getValue()>=90) {
				map1.put(entry.getKey(), "Gold");
			}
			else if(entry.getValue()>=80) {
				map1.put(entry.getKey(), "Silver");
			}
			else if(entry.getValue()>=70) {
				map1.put(entry.getKey(), "Bronze");
			}
		}
		return map1;
	}
	public static void main(String[] args) {
		
		Map<Integer, Integer> map=new HashMap<>();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the total nubmer of students to enter: ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			Integer a=scan.nextInt();
			Integer b=scan.nextInt();
			map.put(a,b);
		}
		System.out.println(getStudents(map));
	}
}
