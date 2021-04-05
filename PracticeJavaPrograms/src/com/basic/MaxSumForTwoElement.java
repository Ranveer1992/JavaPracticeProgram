package com.basic;

import java.util.Scanner;

public class MaxSumForTwoElement {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter size of array");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.println("Insert Element is ::");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				int maxSum;
				//First Method
				maxSum = findSumForTwoElement(arr);
				//Second Method
				maxSum = findSumForTwoElement1(arr);
				System.out.println("maxSum => " + maxSum);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	//Difference between max and min
	private static int findSumForTwoElement1(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return max-min;
	}
	//Maximum sum for two Element
	private static int findSumForTwoElement(int[] arr) {
		int sum = 0;
		int total;
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			while (j < arr.length) {
				total = Math.abs(arr[i] - arr[j]);
				if (sum < total) {
					sum = total;
				}
				j++;
			}
		}
		return sum;
	}

}
