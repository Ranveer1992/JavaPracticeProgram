package com.ds.sorting;

import java.util.Scanner;

public class BuubleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many number you want to array::");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter element is :: ");
	    for(int i=0;i<n;i++){
	    	arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n-1;i++){
	    	for(int j=0;j<n-1-i;j++){
	    		if(arr[j] > arr[j+1]){
	    			int temp = arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    }
	    System.out.println("Bubble Sort is :: ");
	    for(int i=0;i<n;i++){
	    	System.out.print(arr[i]+" ");
	    }
	}

}
