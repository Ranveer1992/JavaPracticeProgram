package com.basic.files;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/hello.txt");
		FileWriter out = new FileWriter("/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/writeFile.txt");
		try{
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
			System.out.println("File write has been successfully!");
		}catch(Exception ex){
			System.out.println("Exception is :: "+ex.toString());
		}finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	
	}

}
