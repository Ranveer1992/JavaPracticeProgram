package com.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CountEachCharOccurence {

	public static void main(String[] args) {
		String str = "ranveer";
		countEachChar(str);
	}

	private static void countEachChar(String str) {
		int CounterArr[] = new int[256];
		char strArr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			CounterArr[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			strArr[i] = str.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == strArr[j]) {
					flag++;
				}
			}
			if (flag == 1) {
				System.out.println(
						"Occurrence of char " + str.charAt(i) + " in the String is:" + CounterArr[str.charAt(i)]);
			}
		}
	}

}
