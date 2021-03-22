package com.Basic.Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HMapSortingByvalues {
	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println("Before Sorting:");
		System.out.println("hmap is ::"+hmap);
		Set set = hmap.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Key ::"+me.getKey()+" Value ::"+me.getValue());
		}
		System.out.println("After Sorting by value:");
		Map<Integer, String> map = sortedByValue(hmap); 
		System.out.println("map is ::"+map);
		Set mapSet = map.entrySet();
		Iterator mapItr = mapSet.iterator();
		while(mapItr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)mapItr.next();
			System.out.println("Key ::"+mapEntry.getKey()+" Value ::"+mapEntry.getValue());
		}
	}

	private static HashMap sortedByValue(HashMap<Integer, String> hmap) {
		List list = new LinkedList(hmap.entrySet());
	
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry)(o1)).getValue())
						.compareTo(((Map.Entry)(o2)).getValue());
				}
		});
		HashMap sortedHmap = new LinkedHashMap();
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			sortedHmap.put(entry.getKey(),entry.getValue());
		}
		return sortedHmap;
	}
}
