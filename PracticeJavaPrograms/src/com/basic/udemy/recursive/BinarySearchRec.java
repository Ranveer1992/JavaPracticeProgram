package com.basic.udemy.recursive;

public class BinarySearchRec {

	public int binarySearch(int[] arr, int item, int left, int right) {
		//base case
		if(right < left) {
			return -1;
		}
		int middle = (left + right) / 2;
		if (arr[middle] == item)
			return middle;
		if (arr[middle] < item) {
			return binarySearch(arr,item,middle+1,right);
		} else {
			return binarySearch(arr,item,left,middle-1);
		}
	}

}
