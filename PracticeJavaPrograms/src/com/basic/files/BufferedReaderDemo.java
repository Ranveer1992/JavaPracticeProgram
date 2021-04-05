package com.basic.files;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		try {
			File f = new File("/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/hibernate.cfg.xml");
			FileReader file = new FileReader(f);
			BufferedReader br = new BufferedReader(file);
			String st;
			System.out.println("File Reading.....");
			while((st=br.readLine())!=null){
				System.out.println(st);
			}
		} catch (Exception ex) {
			System.out.println("Exception is :: "+ex.toString());
		}
	}

}
