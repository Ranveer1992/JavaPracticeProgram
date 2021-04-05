package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CountOfWord {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket Ranveer Singh Lodhi Singh Lodhi This is this This";
		String split [] = str.split(" ");
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		for(int i=0;i<split.length;i++){
			if(map.containsKey(split[i])){
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}else{
				map.put(split[i], 1);
			}
		}
		System.out.println("Count Word Result :: ");
		System.out.println(map);
		System.out.println("While Loop::");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(me.getValue() +" "+me.getKey());
		}
		
		System.out.println("For Loop::");
		for(Map.Entry me:map.entrySet()){
			System.out.println(me.getValue()+" "+me.getKey());
		}
		
	}

}
