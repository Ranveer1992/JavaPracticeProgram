package com.basic.fileio;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ranveersingh.lodhi
 *
 */
public class BufferedOutputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		String path1 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/sample.txt";
		String path2 = "/home/i-exceed.com/ranveersingh.lodhi/Documents/EclipseWorkspace/BegginerJavaProject/Resource/outputstreamFile.txt";
		
		
		FileOutputStream fout = new FileOutputStream(path2);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s1 = "Buffered Output Stream Example1.............\n";
		String s2 = "Buffered Output Stream Example2.............";
		byte b1[]=s1.getBytes();
		byte b2[]=s2.getBytes();
		try {
			bout.write(b1);
			bout.write(b2);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("success");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
