package com.FileInputOutput;

import java.io.*;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		InputStreamReader cin = null;
		try {
			System.out.println("Enter character 'q' for quit?");
			cin = new InputStreamReader(System.in);
			char ch;
			do{
				ch = (char) cin.read();
				System.out.print(ch);
			}while(ch !='q');
		} catch (Exception ex) {
			System.out.println("Exception :: " + ex.toString());
		}finally{
			if(cin!=null){
				cin.close();
			}
		}
	}

}
