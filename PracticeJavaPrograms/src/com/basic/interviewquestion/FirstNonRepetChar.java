package com.basic.interviewquestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountIndex {
	int index, count;

	CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}

	public void incCount() {
		this.count++;
	}
}

public class FirstNonRepetChar {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int index = firstNonRepeateCharUsingCountArr(str);
		System.out.println("firstNonRepeateCharUsingCountArr :: " + str.charAt(index));

		int index1 = firstNonRepeateCharUsingHashMap(str);
		System.out.println("\nfirstNonRepeateCharUsingHashMap :: " + str.charAt(index1));

	}

	private static int firstNonRepeateCharUsingCountArr(String str) {
		int index = -1;
		int count[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static int firstNonRepeateCharUsingHashMap(String str) {
		int index = -1;
		Map<Character, CountIndex> hmap = new HashMap(256);
		for (int i = 0; i < str.length(); i++) {
			if (hmap.containsKey(str.charAt(i))) {
				hmap.get(str.charAt(i)).incCount();
			} else {
				hmap.put(str.charAt(i), new CountIndex(i));
			}
		}
		for (Map.Entry<Character, CountIndex> me : hmap.entrySet()) {
			int c = me.getValue().count;
			int ind = me.getValue().index;
			if (c == 1) {
				index = ind;
				break;
			}
		}

		return index;
	}

}
