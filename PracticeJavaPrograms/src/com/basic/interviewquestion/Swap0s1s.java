package com.basic.interviewquestion;

public class Swap0s1s {
	public static void main(String[] args) {
		// Array taken for consideration
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };

		// Using inbuilt function to store array size
		int n = arr.length;

		// Calling function that segregates array
		segregate0and1(arr, n);

		// Printing the above segregated array
		print(arr, n);
	}

	private static void segregate0and1(int[] arr, int n) {
		int left=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				int temp = arr[left];
				arr[left]=arr[i];
				arr[i]=temp;
				++left;
			}
		}
	}

	private static void print(int[] arr, int n) {
		System.out.println("Array is :: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
