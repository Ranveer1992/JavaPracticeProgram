package com.Basic.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ranveersingh.lodhi
 *
 */
public class FileInputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		String path1 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/sample.txt";
		
		String path2 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/outputstreamFile.txt";
		
		FileInputStream fin = new FileInputStream(path2);
		int ch=0;
		System.out.println("File Reading........");
		try {
			while((ch=fin.read())!=-1){
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
