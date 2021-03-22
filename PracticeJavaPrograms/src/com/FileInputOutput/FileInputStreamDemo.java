package com.FileInputOutput;
import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		in = new FileInputStream("/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/hello.txt");
		out = new FileOutputStream("/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/copyhello.txt");
		try{
			int c;
			while((c=in.read()) != -1){
				out.write(c);
			}
			System.out.println("copy file has been completed");
		}catch(Exception ex){
			System.out.println("Exception :: "+ex.toString());
		}finally{
			if(in != null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}

}
