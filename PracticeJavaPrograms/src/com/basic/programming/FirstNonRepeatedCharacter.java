package com.basic.programming;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string ::");
			String str = sc.nextLine();
			HashMap<Character, Integer> hmap = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (hmap.containsKey(c)) {
					hmap.put(c, hmap.get(c) + 1);
				} else {
					hmap.put(c, 1);
				}
			}
			char ch = firstNonReapeatChar(str, hmap);
			System.out.println("First Non Repeated Character is :: " + ch);
		} catch (Exception ex) {
			System.out.println("Exception :: " + ex);
		} finally {
			sc.close();
		}
	}

	private static Character firstNonReapeatChar(String str, HashMap<Character, Integer> hmap) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hmap.get(c) == 1) {
				return c;
			}
		}
		return null;
	}

}
