package com.basic.files;

import java.io.*;

public class PrintRecursiveFileAndDirectoryName {

	public static void printRecursiveFileAndDirectoryName(File[] arr, int index, int lavel) {
		if(index == arr.length){
			return;
		}
		//tab print 
		for(int i=0;i<lavel;i++){
			System.out.print("\t");
		}
		if(arr[index].isFile()){
			System.out.println(arr[index].getName());
		}else if(arr[index].isDirectory()){
			System.out.println("["+arr[index].getName()+"]");
			//recursive call for sub directory
			printRecursiveFileAndDirectoryName(arr[index].listFiles(),0,lavel+1);
		}
		//recursive call for main directory
		printRecursiveFileAndDirectoryName(arr,++index,lavel);
	}
	public static void main(String[] args) {
		String source = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject";
		try {
			File f = new File(source);
			if (f.exists() && f.isDirectory()) {
			
				File arr[]  = f.listFiles();
				System.out.println("**********************************************");
				System.out.println("Files from main directory : " + f);
				System.out.println("**********************************************");
				
				printRecursiveFileAndDirectoryName(arr,0,0);
			}
		} catch (Exception ex) {
			System.out.println("Exception is :: " + ex.toString());
		}
	}

}
