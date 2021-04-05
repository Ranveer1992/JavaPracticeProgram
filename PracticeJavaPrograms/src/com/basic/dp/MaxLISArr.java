package com.basic.dp;

import java.util.Scanner;

public class MaxLISArr {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter size of array::");
			int n = sc.nextInt();
			int arr[] = new int[n];
			int lis[] = new int[n];
			System.out.println("Insert element in array::");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				lis[i] = 1;
			}
			int lcs = lis(arr, lis, n);
			System.out.println("max LIS is :: " + lcs);
		}
	}

	private static int lis(int[] arr, int[] lis, int n) {
		int maxLis = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (maxLis < lis[i]) {
				maxLis = lis[i];
			}
		}
		return maxLis;
	}

}
