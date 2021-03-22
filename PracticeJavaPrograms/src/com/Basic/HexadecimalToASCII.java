package com.Basic;

import java.util.Scanner;

public class HexadecimalToASCII {

	public static String hexToASCII(String hex) 
    { 
        // initialize the ASCII code string as empty. 
        String ascii = ""; 
  
        for (int i = 0; i < hex.length(); i += 2) { 
  
            // extract two characters from hex string 
            String part = hex.substring(i, i + 2); 
  
            // change it into base 16 and typecast as the character 
            char ch = (char)Integer.parseInt(part, 16); 
  
            // add this char to final ASCII string 
            ascii = ascii + ch; 
        } 
  
        return ascii; 
    } 
    
    
    public static String ASCIItoHEX(String ascii) 
    { 
        // Initialize final String 
        String hex = ""; 
  
        // Make a loop to iterate through 
        // every character of ascii string 
        for (int i = 0; i < ascii.length(); i++) { 
  
            // take a char from 
            // position i of string 
            char ch = ascii.charAt(i); 
  
            // cast char to integer and 
            // find its ascii value 
            int in = (int)ch; 
  
            // change this ascii value 
            // integer to hexadecimal value 
            String part = Integer.toHexString(in); 
  
            // add this hexadecimal value 
            // to final string. 
            hex += part; 
        } 
        // return the final string hex 
        return hex; 
    } 
    
    
    public static void main(String[] args) 
    { 
        // print the ASCII string. 
       
        
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String::");
        String s = sc.nextLine();
        //askldjfkdaslf
        System.out.println("Hexa to Ascii -> " +hexToASCII(s));
        System.out.println("getBytes() -> " +hexToASCII(s).getBytes());
        //System.out.println("Ascii to Hexa -> "+ASCIItoHEX(s)); 
    } 
    
    
    
  
  
}
