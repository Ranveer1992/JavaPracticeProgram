package com.basic.interviewquestion;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<StuHasCodeEquals, String> map = new HashMap();

		StuHasCodeEquals one = new StuHasCodeEquals(1, "Geeks1");
		StuHasCodeEquals two = new StuHasCodeEquals(2, "Geeks2");

		// put keys in map
		map.put(one, one.getName());
		map.put(two, two.getName());
		
		// changing key state so that 
        // hashcode() should be calculated again 
        one.setName("Not Geeks1"); 
        two.setName("Not Geeks2"); 
        
        //map.put(one, one.getName());
		//map.put(two, two.getName());
		
        // still prints Geeks1 
        System.out.println(map.get(one)); 
  
        // still prints Geeks1 
        System.out.println(map.get(two)); 
  
        // try with newly created key with same Rollno 
        StuHasCodeEquals three = new StuHasCodeEquals(1, "Geeks3"); 
  
        // we get Geeks1 
        System.out.println(map.get(three)); 
        
        // try with newly created key with same Rollno 
        StuHasCodeEquals four = new StuHasCodeEquals(2, "Geeks4"); 
  
        // we get Geeks2 
        System.out.println(map.get(four)); 
        
    
	}

}
