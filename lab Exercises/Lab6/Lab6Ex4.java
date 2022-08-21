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
		map.put(1, 77);
		map.put(2, 96);
		map.put(3,94);
		map.put(4, 84);
		map.put(5, 73);
		map.put(6, 78);
		map.put(7, 90);
		System.out.println(getStudents(map));
	}
}
