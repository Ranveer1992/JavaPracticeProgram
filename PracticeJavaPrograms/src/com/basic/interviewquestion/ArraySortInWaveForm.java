package com.basic.interviewquestion;

import java.util.Arrays;

public class ArraySortInWaveForm {

	public static void main(String[] args) {
		ArraySortInWaveForm ob = new ArraySortInWaveForm();
		int arr[] = { 10, 90, 49, 2, 1, 5, 23 };
		int n = arr.length;
		//ob.sortInWave(arr, n);
		ob.sortInWaveUsingWithoutSort(arr, n);
		System.out.println("Using sort method print in wave form :: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private void sortInWave(int[] arr, int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-1;i=i+2) {
			swap(arr,i,i+1);
		}
	}
	private void sortInWaveUsingWithoutSort(int[] arr, int n) {
		for(int i=0;i<arr.length-1;i+=2) {
			if(i>0 && arr[i-1]>arr[i]) {
				swap(arr,i-1,i);
			}
			if(i<n-1 && arr[i]<arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
	}
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
