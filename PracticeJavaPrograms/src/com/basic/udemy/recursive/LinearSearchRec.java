package com.basic.udemy.recursive;

public class LinearSearchRec {
	public int findItemRec(int arr[], int index, int item) {
		// base case
		if (index > arr.length-1)
			return -1;
		if (arr[index] == item)
			return index;

		return findItemRec(arr, index + 1, item);
	}
}
