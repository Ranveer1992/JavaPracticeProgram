package com.Basic.FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ranveersingh.lodhi
 *
 */
public class FileOutputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		String path1 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/sample.txt";
		String path2 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/outputstreamFile.txt";
		
		FileOutputStream fout = new FileOutputStream(path2);
		try {
			String s = "Welcome to India.";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Write file successcull!!");
			
		} catch (IOException e) {
			System.out.println("Failed!!");
			e.printStackTrace();
		}
	}

}
