package com.basic.interviewquestion;

import java.util.Arrays;
import java.util.HashMap;

public class TwoArrayEquals {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2, 3, 3 };
		int arr2[] = { 2, 3, 5, 5, 2, 3, 3 };

		System.out.println("Using array sort method ::");
		if (areEqual(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");

		// using Map
		System.out.println("\nUsing hmap method :: ");
		if (areEqualUsingMap(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");

		// using xor
		System.out.println("\nUsing xor method :: ");
		if (areEqualUsingXOR(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean areEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean areEqualUsingMap(int[] arr1, int[] arr2) {
		boolean lstatus = true;
		if (arr1.length != arr2.length) {
			return false;
		}
		HashMap<Integer, Integer> hmap = new HashMap();
		for (int i = 0; i < arr1.length; i++) {
			if (hmap.containsKey(arr1[i])) {
				hmap.put(arr1[i], hmap.get(arr1[i]) + 1);
			} else {
				hmap.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (!hmap.containsKey(arr2[i])) {
				lstatus = false;
				break;
			}
			if (hmap.get(arr2[i]) == 0) {
				lstatus = false;
				break;
			}
			hmap.put(arr2[i], hmap.get(arr2[i]) - 1);
		}
		return lstatus;
	}

	private static boolean areEqualUsingXOR(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		int a1 = arr1[0];
		int b1 = arr2[0];
		for (int i = 1; i < arr1.length; i++) {
			a1 = a1 ^ arr1[i];
		}
		for (int i = 1; i < arr2.length; i++) {
			b1 = b1 ^ arr2[i];
		}
		int all_xor = a1 ^ b1;
		if (all_xor == 0) {
			return true;
		}
		return false;
	}

}
