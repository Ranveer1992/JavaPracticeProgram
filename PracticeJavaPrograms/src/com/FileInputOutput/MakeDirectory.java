package com.FileInputOutput;

import java.io.*;
public class MakeDirectory {

	public static void main(String[] args) {
		String dirName = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/JavaFiles";
		File d = new File(dirName);
		//create new Directory
		boolean status = d.mkdir();
		System.out.println("Create directory status is :: "+status);
	}

}
