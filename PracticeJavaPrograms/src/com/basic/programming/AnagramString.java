package com.basic.programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter First string is ::");
			String str1 = sc.nextLine();
			System.out.println("Enter Second string is ::");
			String str2 = sc.nextLine();
			boolean isAnagram = checkAnagram1(str1,str2);
			// boolean isAnagram = checkAnagram2(str1,str2);
			//boolean isAnagram = checkAnagram3(str1, str2);
			if (isAnagram) {
				System.out.println("Given string are anagram");
			} else {
				System.out.println("Given string are not anagram");
			}
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		} finally {
			sc.close();
		}

	}

	private static boolean checkAnagram1(String str1, String str2) {
		boolean lstatus = false;
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return lstatus;
		} else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
	}

	private static boolean checkAnagram2(String first, String second) {
		boolean lstatus = false;
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "");
		if (first.length() != second.length()) {
			return lstatus;
		} else {
			for (int i = 0; i < first.length(); i++) {
				char c = first.charAt(i);
				int index = second.indexOf(c);
				if (index == -1) {
					return lstatus;
				}
				second = second.substring(0, index) + second.substring(index + 1, second.length());
			}
		}
		return true;
	}

	private static boolean checkAnagram3(String first, String second) {
		boolean lstatus = false;
		first = first.replaceAll("\\s", "").toLowerCase();
		second = second.replaceAll("\\s", "").toLowerCase();
		if (first.length() != second.length()) {
			return lstatus;
		} else {
			HashMap<Character,Integer> hmap1 = new HashMap<>();
			HashMap<Character,Integer> hmap2 = new HashMap<>();
			hmap1 = createMapKeys(first);
			hmap2 = createMapKeys(second);
			if(hmap1.equals(hmap2)){
				return true;
			}else{
				return false;
			}
		}
	}

	private static HashMap<Character, Integer> createMapKeys(String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		return map;
	}

}
