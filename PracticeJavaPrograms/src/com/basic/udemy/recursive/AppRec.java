package com.basic.udemy.recursive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.basic.udemy.searchalgorithm.LinearSearch;

public class AppRec {

	public static void main(String args[]) {
		boolean FACT_CALL = false;
		boolean FIBBO_CALL = false;
		boolean TOH_CALL = false;
		boolean LINEAR_SEARCH = false;
		boolean BINARY_SEARCH = true;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			if (FACT_CALL) {
				System.out.println("Factorial head" + n + " is ::" + Factorial.head(n));
				System.out.println("Factorial tail" + n + " is ::" + Factorial.tail(n, 1));
			}
			if (FIBBO_CALL) {
				System.out.println("Fibbonacci head ::" + Fibbonacci.headFibbo(n));
				System.out.println("Fibbonacci tail ::" + Fibbonacci.tailFibbo(n, 0, 1));
			}
			if (TOH_CALL) {
				System.out.println("Towers of Honoi solutions ::");
				TowersOfHonoi.solve(n - 1, 'A', 'B', 'C');
			}
			if (LINEAR_SEARCH) {
				int arr[] = new int[n];
				System.out.println("Insert element array is ::");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("Enter item which you want to search in linear");
				int item = sc.nextInt();
				LinearSearchRec linear = new LinearSearchRec();
				System.out.println(item + " present in index number is " + linear.findItemRec(arr, 0, item));
			}
			if (BINARY_SEARCH) {
				int arr[] = new int[n];
				System.out.println("Insert element array is ::");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("Enter item which you want to search in Binary");
				int item = sc.nextInt();
				Arrays.sort(arr);
				BinarySearchRec binaryObj = new BinarySearchRec();
				System.out.println(item + " Binary search present in index number is " + binaryObj.binarySearch(arr,item,0,arr.length-1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}
