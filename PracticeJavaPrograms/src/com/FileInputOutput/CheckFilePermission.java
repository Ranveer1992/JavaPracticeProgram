package com.FileInputOutput;

import java.io.*;

public class CheckFilePermission {

	public static void main(String[] args) {
		String filePath = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/hello.txt";
		try {
			File f = new File(filePath);
			boolean exists = f.exists();
			if(exists){
				//changing file permission
				f.setExecutable(true);
				f.setReadable(true);
				f.setWritable(true);
				System.out.println("File permission description::");
				System.out.println("File canExecutable :: "+f.canExecute());
				System.out.println("File canRead :: "+f.canRead());
				System.out.println("File canWrite :: "+f.canWrite());
				System.out.println("File lastModified :: "+f.lastModified());
				System.out.println("File length :: "+f.length());
				System.out.println("File setReadOnly :: "+f.setReadOnly());
				
			}
		} catch (Exception ex) {
			System.out.println("Exception is:: " + ex.toString());
		}

	}

}
