package com.basic;

import java.util.Scanner;

public class PrintDistinctElementInArr {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			while (true) {
				sc = new Scanner(System.in);
				System.out.println("Enter size of array:::");
				int n = sc.nextInt();
				int arr[] = new int[n];
				System.out.println("Insert Element is ::");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				//First Method
				printDistinctElement(arr,n);
				//Second Method
				printNonDuplicateElement(arr,n);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
	//NON Duplicate Print Element
    private static void printNonDuplicateElement(int[] arr, int n) {
    	boolean flag;
    	System.out.println("Non Duplicate Elements::");
    	for(int i=0;i<n;i++){
    		flag = true;
    		int j;
    		for(j=0;j<n;j++){
    			if(i!=j && arr[i]==arr[j]){
    				flag=false;
    				break;
    			}
    		}
    		if(flag){
    			System.out.print(arr[i]+" ");
    		}
    	}
	}
	//printDistinct
	private static void printDistinctElement(int[] arr,  int n) {
		for(int i=0;i<n;i++){
			int j;
			for(j=0;j<i;j++){
				if(arr[i]==arr[j]){
					break;
				}
			}
			if(i==j){
				System.out.print(arr[i]+" ");
			}
		}
	}

}
