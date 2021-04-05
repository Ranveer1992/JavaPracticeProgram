package com.basic.ds.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many number you want to array::");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter element is :: ");
	    for(int i=0;i<n;i++){
	    	arr[i] = sc.nextInt();
	    }
	    for(int i = 0;i<n;i++){
	    	for(int j=i+1;j<n;j++){
	    		if(arr[i]>arr[j]){
	    			int temp = arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    }
	    System.out.println("Selectiong Sort is :: ");
	    for (int i=0;i<n;i++){
	    	System.out.print(arr[i]+" ");
	    }
	}

	

}
