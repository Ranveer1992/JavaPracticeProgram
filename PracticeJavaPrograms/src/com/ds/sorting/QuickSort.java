package com.ds.sorting;

import java.util.Scanner;

public class QuickSort {
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				//swap i and j index value
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swap i+1 and high index value
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void quickSort(int[] arr, int low, int high) {
	   if(low<high){
		   int pivot = partition(arr,low,high);
		   quickSort(arr,pivot-1,low);
		   quickSort(arr,pivot+1,high);
	   }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element do you want ?");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Insert element is ::");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		quickSort(arr,0,n-1);
		//display sorted array
		System.out.println("Quick Sort is :: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	
}
