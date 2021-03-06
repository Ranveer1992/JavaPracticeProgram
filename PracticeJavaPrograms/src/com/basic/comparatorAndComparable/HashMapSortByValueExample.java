package com.basic.comparatorAndComparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HashMapSortByValueExample {

	public static void main(String[] args) {
		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		System.out.println("Before Sorting:");
		Set set = hashmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			System.out.print(pair.getKey() + ": ");
			System.out.println(pair.getValue());
		}
		Map<Integer, String> map = sortByValues(hashmap);
		System.out.println("After Sorting by value:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator2.next();
			System.out.print(pair.getKey() + ": ");
			System.out.println(pair.getValue());
		}
	}

	private static Map<Integer, String> sortByValues(HashMap<Integer, String> hashmap) {
		LinkedHashMap hmap = new LinkedHashMap();
		List list = new LinkedList(hashmap.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
			
		});
		for(Iterator it = list.iterator();it.hasNext();) {
			Map.Entry entry = (Map.Entry)it.next();
			hmap.put(entry.getKey(), entry.getValue());
		}
		return hmap;
	}

}
