package com.basic.programming;

import java.util.Scanner;

public class ReverseString {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string is ::");
			String str = sc.nextLine();
			System.out.println("Before reverse :: "+str);
			String rev = reverse(str);
			System.out.println("After reverse :: "+rev);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		} finally {
			sc.close();
		}
	}

	private static String reverse(String str) {
		String rev = "";
		if (str.length() > 0) {
			for (int i = str.length()-1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
		}
		return rev;
	}
}
