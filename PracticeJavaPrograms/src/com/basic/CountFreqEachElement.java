package com.basic;

import java.util.Scanner;

public class CountFreqEachElement {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter size of array");
				int n = sc.nextInt();
				int[] arr = new int[n];
				int[] freq = new int[n];
				System.out.println("Insert Element is ::");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
					freq[i] = -1;
				}
				findFreqEachElement(arr, freq);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	private static void findFreqEachElement(int[] arr, int[] freq) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = 0;
				}
			}
			if (freq[i] != 0) {
				freq[i] = count;
			}
		}
		System.out.println("Print Element and Frequency:::");
		for (int i = 0; i < arr.length; i++) {
			if (freq[i] != 0) {
				System.out.println("Element is : " + arr[i] + " Freq is : " + freq[i]);
			}
		}
	}

}
