package com.basic.files;

import java.io.*;

public class ListOfDirectory {

	public static void main(String[] args) {
		File file = null, f = null;
		String[] paths;
		try {
			String pathString = "/home/i-exceed.com/ranveersingh.lodhi/Desktop";
			file = new File(pathString);
			paths = file.list();
			for (String dirname : paths) {
				f = new File(pathString + "/" + dirname);
				if (f.isDirectory()) {
					System.out.println("Directory Details is ::::::::::::::::::::::");
					System.out.println(dirname);

					System.out.println("File name :" + f.getName());
					System.out.println("Path: " + f.getPath());
					System.out.println("Absolute path:" + f.getAbsolutePath());
					System.out.println("Parent:" + f.getParent());
					System.out.println("Exists :" + f.exists());
					if (f.exists()) {
						System.out.println("Is writeable:" + f.canWrite());
						System.out.println("Is readable" + f.canRead());
						System.out.println("Is a directory:" + f.isDirectory());
						System.out.println("File Size in bytes " + f.length());
					}
					System.out.println("/*******************************Finish************************/");
					System.out.println("\n\n");
				}

			}
		} catch (Exception ex) {
			System.out.println("Exception is :: " + ex.toString());
		}
	}

}
