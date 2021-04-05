package com.basic.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class MoveFileDemo {

	public static void main(String[] args) throws IOException {
	
		String source = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/hello.txt";
		String target = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/JavaFiles/hello.txt";
		try{
			Path p = Files.move(Paths.get(source), Paths.get(target));
			if(p!=null){
				System.out.println("File moved has been successfully!");
			}else{
				System.out.println("File moved has been failed!!!");
			}
		}catch(Exception ex){
			System.out.println("Exception is :: "+ex.toString());
		}
	
	}

}
