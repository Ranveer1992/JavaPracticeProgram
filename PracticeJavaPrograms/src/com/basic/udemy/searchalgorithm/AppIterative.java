package com.basic.udemy.searchalgorithm;

import java.util.Scanner;

public class AppIterative {

	public static void main(String args[]) {
		boolean LINEAR_SEARCH = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how much element requird in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Insert element array is ::");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		if(LINEAR_SEARCH) {
			System.out.println("Enter item which you want to search in linear");
			int item = sc.nextInt();
			LinearSearch linear = new LinearSearch();
			System.out.println(item+" present in index number "+linear.findItem(arr, item));
		}

	}
}
