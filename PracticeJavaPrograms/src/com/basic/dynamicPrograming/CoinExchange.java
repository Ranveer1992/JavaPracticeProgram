package com.basic.dynamicPrograming;

import java.util.Arrays;

public class CoinExchange {

	public static void main(String[] args) {
		int n = 18;
		int[] a = { 7, 5, 1 };

		int minCoinCount = minCoinsRec(a, n);
		System.out.println("min exchange coin count using REC :: " + minCoinCount);

		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int minCoinCount1 = minCoinsDP(a, dp, n);
		System.out.println("\nmin exchange coin count using DP :: " + minCoinCount1);
		System.out.println("\nDP array is ::");
		for (int i = 0; i < n + 1; i++) {
			System.out.print(dp[i] + " ");
		}
		System.out.println();
	}

	private static int minCoinsDP(int[] a, int[] dp, int n) {
		if (n == 0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (n - a[i] >= 0) {
				int subAns = 0;
				if (dp[n - a[i]] != -1) {
					subAns = dp[n - a[i]];
				} else {
					subAns = minCoinsDP(a, dp, n - a[i]);
				}
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}

	private static int minCoinsRec(int[] a, int n) {
		if (n == 0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (n - a[i] >= 0) {
				int subAns = minCoinsRec(a, n - a[i]);
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return ans;
	}

}
