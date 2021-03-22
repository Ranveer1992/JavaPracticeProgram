package com.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter First String ::");
			String s1 = sc.nextLine();
			System.out.println("Enter Second String ::");
			String s2 = sc.nextLine();
			boolean findAnagram = getAnagramString(s1, s2);
			if (findAnagram) {
				System.out.println("Given String Are Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}

	private static boolean getAnagramString(String s1, String s2) {
		boolean flag = false;
		if (s1.length() == s2.length()) {
			char str1[] = s1.toLowerCase().toCharArray();
			char str2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			flag = Arrays.equals(str1, str2);
			return flag;
		} else {
			System.out.println("String length should be the same");
			return false;
		}
	}

}
