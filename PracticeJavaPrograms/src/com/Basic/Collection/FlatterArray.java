package com.Basic.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FlatterArray {
	public static <T> Stream <T> flattenStream(List<List<T>> lists) {
		List<T> finalList = new ArrayList<>();
		for (List<T> list : lists) {
			list.stream().forEach(finalList::add);
		}
		return finalList.stream();
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2);
		List<Integer> b = Arrays.asList(3, 4, 5, 6);
		List<Integer> c = Arrays.asList(7, 8, 9);

		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		System.out.println("ArrayList:: " + arr);

		List<Integer> flatList = new ArrayList<Integer>();
		flatList = flattenStream(arr).collect(Collectors.toList());

		// Print the flattened list
		System.out.println(flatList);

	}

}
