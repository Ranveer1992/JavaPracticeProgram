package com.Basic;

import java.util.HashMap;
import java.util.Set;


public class CountOfCharacter {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket Ranveer Singh Lodhi Singh Lodhi This is this This";
		char letterArr [] = str.toCharArray();
		HashMap<Character,Integer>map = new HashMap<Character,Integer>();
		for(int i=0;i<letterArr.length;i++){
			if(map.containsKey(letterArr[i])){
				map.put(letterArr[i], map.get(letterArr[i])+1);
			}else{
				map.put(letterArr[i], 1);
			}
		}
		System.out.println("Count Character Result :: ");
		System.out.println(map);
		System.out.println("Using set is::");
		Set<Character> keys = map.keySet();
		for(Character ch : keys) {
			if(map.get(ch)>1) {
				System.out.println("Char "+ch+" "+map.get(ch));
			}
		}
		
		
	}

}
