package com.Basic;

public class Matrix {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arr[i][j] = i*j+10;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++){
			printMatrix(arr,i);
		}
	}
	private static void printMatrix(int[][] arr, int i) {
		System.out.println("print array :: "+i);
		for(int j=0;j<4;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}

}
