package com.udemy.searchalgorithm;

public class LinearSearch {
	public int findItem(int arr[],int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
