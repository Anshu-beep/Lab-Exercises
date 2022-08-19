package Day5;

//Create a method which accepts a hash map and return the values of the map on sorted order as a list
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;										
import java.util.Map.Entry;
import java.util.Set;

public class Lab6Ex1 {
	
	static List getValues(HashMap<String, Integer>MyMap) 
	{
		Set<Entry<String,Integer> >entries=MyMap.entrySet();
		Iterator<Entry<String, Integer>> itr1=entries.iterator();
		ArrayList<Integer> valueList = new ArrayList<>(MyMap.values());
		Collections.sort(valueList);
		System.out.println(valueList);
		for(int i=0;i<valueList.size();i++) 
		{
			for(Entry<String, Integer> entry : entries) 
			{
				if(entry.getValue()==valueList.get(i)) 
				{
					System.out.println(entry);
				}
			}
		}
		return valueList;
	}
	public static void main(String[] args)
	{
		HashMap<String, Integer> count=new HashMap<>();
		count.put("A", 29);
		count.put("B", 27);
		count.put("C", 31);
		count.put("D", 11);
		getValues(count);
	}
}
