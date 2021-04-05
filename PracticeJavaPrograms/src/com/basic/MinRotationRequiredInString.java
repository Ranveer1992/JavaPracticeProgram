package com.basic;

import java.util.Scanner;

public class MinRotationRequiredInString {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter New String");
				String line = sc.nextLine();
				int countRotate = minRotateCount(line);
				System.out.println("countRotate is :: " + countRotate);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	private static int minRotateCount(String line) {
		int size = line.length();
		String temp = line + line;
		System.out.println("temp=>" + temp);
		for (int i = 1; i <= size; i++) {
			String subStr;
			subStr = temp.substring(i, line.length() + i);
			if (line.equals(subStr)) {
				return i;
			}
		}
		return size;
	}

}
