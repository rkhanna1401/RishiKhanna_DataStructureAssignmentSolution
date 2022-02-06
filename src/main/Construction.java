package main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Construction {


	public Map<Integer, Integer> defineConstructionOrder(LinkedHashMap<Integer, Integer> floorSize) {

		Map<Integer, Integer> temp
		= floorSize.entrySet()
		.stream()
		.sorted((i1, i2)
				-> i2.getValue().compareTo(
						i1.getValue()))
		.collect(Collectors.toMap(
				Map.Entry::getKey,
				Map.Entry::getValue,
				(e1, e2) -> e1, LinkedHashMap::new));

		return temp;

	}

	public void display(Map<Integer, Integer> sorted,Map<Integer, Integer> unSorted ) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		String value = "";
		
		while(!sorted.isEmpty()) {
			int count = 0;
			Set<Entry<Integer, Integer>> s1 = sorted.entrySet();
			int sortedKey = s1.iterator().next().getKey();
			Set<Entry<Integer, Integer>> s2 = unSorted.entrySet();
			int unSortedKey = s2.iterator().next().getKey();
			
			if(sortedKey == unSortedKey && al.isEmpty()) {
				System.out.println("Day: "+sortedKey);
				System.out.println(s1.iterator().next().getValue());	
				count++;
			}
			if(al.contains(sortedKey)) {
				System.out.println();
				System.out.println("Day: "+unSortedKey);
				System.out.println(s2.iterator().next().getValue()+" "+value);
				al.clear();
				value="";
			}
			else {
				if(count == 0) {
				System.out.println();
				value =  s2.iterator().next().getValue()+" "+value;
				System.out.println("Day: "+unSortedKey);
				al.add(unSortedKey);
				}
			}

			sorted.remove(sortedKey);
			unSorted.remove(unSortedKey);
			if(sorted.isEmpty()) {
				System.out.println(value);
			}
		}
	}
}
