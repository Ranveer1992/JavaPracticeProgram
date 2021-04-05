package com.basic.files;

import java.io.*;
import java.util.HashSet;
public class DeleteDuplicateLine {
	public static void duplicateRemoveLineFromFile(String source, String destination) throws IOException {
		PrintWriter pw = new PrintWriter(destination);
		BufferedReader br1 = new BufferedReader(new FileReader(source));
		String line1 = br1.readLine();
		while(line1 != null){
			boolean flag = false;
			BufferedReader br2 = new BufferedReader(new FileReader(destination));
			String line2 = br2.readLine();
			while(line2 != null){
				if(line1.equals(line2)){
					flag=true;
					break;
				}
				line2 = br2.readLine();
			}
			if(!flag){
				pw.println(line1);
				pw.flush();
			}
			line1=br1.readLine();
		}
		br1.close();
		pw.close();
		System.out.println("Delete duplicate line from file has been successfull!");
	}
	
	public static void UsingHashsetduplicateRemoveLineFromFile(String source, String destination) throws IOException {
		PrintWriter pw = new PrintWriter(destination);
		BufferedReader br1 = new BufferedReader(new FileReader(source));
		String line = br1.readLine();
		HashSet<String> hs  = new HashSet<>();
		while(line != null){
			if(hs.add(line)){
				pw.println(line);
				pw.flush();
			}
			line = br1.readLine();
		}
		br1.close();
		pw.close();
		System.out.println("Inside UsingHashsetduplicateRemoveLineFromFile::");
		System.out.println("Inside UsingHashsetduplicateRemoveLineFromFile Hashset value is :: "+hs);
		System.out.println("Delete duplicate line from file has been successfull!");
	}
	public static void main(String[] args) throws IOException{
		String source = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/input.txt";
		String destination = "/home/i-exceed.com/ranveersingh.lodhi/Desktop/EclipseProject/Files/ouput.txt";
		boolean flag = false;
		try{
			if(flag){
			duplicateRemoveLineFromFile(source,destination);
			}else{
				UsingHashsetduplicateRemoveLineFromFile(source,destination);
			}
		}catch(Exception ex){
			System.out.println("Exception is :: "+ex.toString());
		}finally{
			System.out.println("Inside finally block::");
	
		}
	}

	

}
