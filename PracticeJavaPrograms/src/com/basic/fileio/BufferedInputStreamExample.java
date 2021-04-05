package com.basic.fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ranveersingh.lodhi
 *
 */
public class BufferedInputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		String path1 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/sample.txt";
		String path2 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/outputstreamFile.txt";
		
		
		FileInputStream fin = new FileInputStream(path2);
		BufferedInputStream bfin = new BufferedInputStream(fin);
		int i=0;
		System.out.println("BufferedInputStream File Reading...");
		try {
			while((i=bfin.read())!=-1){
				System.out.print((char)i);
			}
			bfin.close();
			fin.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
