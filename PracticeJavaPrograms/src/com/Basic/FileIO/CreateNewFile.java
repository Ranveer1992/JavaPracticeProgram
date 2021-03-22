package com.Basic.FileIO;

import java.io.File;

public class CreateNewFile {

	public static void main(String[] args) {
		try {
			String path1 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/sample.txt";
			
			String path2 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/outputstreamFile.txt";
			
			File file = new File(path2);
			boolean isCreate = file.createNewFile();
			if(isCreate) {
				System.out.println("New file created is successfully");
			}else {
				System.out.println("File already exists");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
