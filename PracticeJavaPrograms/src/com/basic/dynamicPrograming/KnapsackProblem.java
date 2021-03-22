package com.basic.dynamicPrograming;

public class KnapsackProblem {

	public static void main(String[] args) {
		int sum = 7;
		int wt[] = { 1, 3, 4, 5 };
		int val[] = { 1, 4, 5, 7 };
		int n = wt.length;
		int T[][] = new int[n + 1][sum + 1];
		int maxSum = knapSacDP(T, wt, val, n, sum);
		System.out.println("max knapsac solution DP is :: " + maxSum);
		System.out.println("\n knapsac matrix is :: ");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sum; j++) {
				System.out.print(T[i][j] + " ");
			}
			System.out.println();
		}
		// Recursion solution is
		int W = sum;
		int maxSumRec = knapSacRec(W, wt, val, n);
		System.out.println("\nmax knapsac solution Recursion is :: " + maxSumRec);

	}

	private static int knapSacDP(int[][] T, int[] wt, int[] val, int n, int sum) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sum; j++) {
				if (i == 0 || j == 0) {
					T[i][j] = 0;
				} else if (j < wt[i - 1]) {
					T[i][j] = T[i - 1][j];
				} else {
					T[i][j] = max(val[i - 1] + T[i - 1][j - wt[i - 1]], T[i - 1][j]);
				}
			}
		}
		return T[n][sum];
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	private static int knapSacRec(int W, int[] wt, int[] val, int n) {
		// Base Case
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W) {
			return knapSacRec(W, wt, val, n - 1);
		} else {
			return max(val[n - 1] + knapSacRec(W - wt[n - 1], wt, val, n - 1), knapSacRec(W, wt, val, n - 1));
		}
	}

}
