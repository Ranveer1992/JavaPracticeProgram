package com.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniqueStringWord {

	public static void main(String[] args) {
		String str = "hello hello hi good good morning morning what are you doing hi";
		String [] splitArr = str.split(" ");
		Map<String,Integer>map = new HashMap<>();
		for(int i=0;i<splitArr.length;i++){
			if(map.containsKey(splitArr[i])){
				int count = map.get(splitArr[i]);
				map.put(splitArr[i], count+1);
			}else{
				map.put(splitArr[i], 1);
			}
		}
		System.out.println("map =>"+map);
		Set set = map.keySet();
		Iterator itr = set.iterator();
		System.out.println("Unique word in given string::");
		while(itr.hasNext()){
			String key = (String) itr.next();
			if(map.containsKey(key) && map.get(key)==1){
				System.out.println(key);
			}
		}
		//map traverse
		System.out.println("Map Traverse::");
		Iterator itr1 = map.entrySet().iterator();
		while(itr1.hasNext()){
			Map.Entry obj = (Map.Entry)itr1.next(); 
			System.out.println("Key :: "+obj.getKey()+"\nvalue :: "+obj.getValue());
		}
	}

}
