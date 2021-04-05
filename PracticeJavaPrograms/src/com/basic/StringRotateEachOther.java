package com.basic;

import java.util.Scanner;

public class StringRotateEachOther {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter first string ::");
			String s1 = sc.nextLine();
			System.out.println("Enter second string ::");
			String s2 = sc.nextLine();
			boolean rotateEachOther = checkRotationgTwoStringEachOther(s1, s2);
			if (rotateEachOther) {
				System.out.println("Given String Rotete Each Other");
			} else {
				System.out.println("Not Roate");
			}
		}
	}

	private static boolean checkRotationgTwoStringEachOther(String s1, String s2) {
		boolean flag = false;
		int n = s1.length();
		int m = s2.length();
		int[] lps = new int[n];
		lps[0] = 0;
		int i = 1;
		int len = 0;
		if (n != m) {
			return flag;
		} else {
			while (i < n) {
				System.out.println("s1.charAt(i)=>"+s1.charAt(i));
				if (s1.charAt(i) == s2.charAt(len)) {
					lps[i] = ++len;
					++i;
				} else {
					if (len == 0) {
						lps[i] = 0;
						++i;
					} else {
						len = lps[len - 1];
					}
				}
			}
			i = 0;
			for (int j = lps[n - 1]; j < m; j++) {
				if (s2.charAt(j) != s1.charAt(i++)) {
					return false;
				}
			}
			return true;
		}
	}

}
