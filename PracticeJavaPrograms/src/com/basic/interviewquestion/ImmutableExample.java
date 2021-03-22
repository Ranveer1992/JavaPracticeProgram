package com.basic.interviewquestion;

import java.util.HashMap;
import java.util.Map;

public class ImmutableExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		StudentImmutable s = new StudentImmutable("ABC", 101, map);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetadata());
		// Uncommenting below line causes error
		// s.regNo = 102;
		map.put("3", "third");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor
		s.getMetadata().put("4", "fourth");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in getter

	}

}
