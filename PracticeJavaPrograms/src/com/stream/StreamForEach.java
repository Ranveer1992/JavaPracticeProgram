package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamForEach {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ranveer");
		list.add("singh");
		list.add("lodhi");
		System.out.println("list :: "+list);
		Stream<ArrayList<String>> value = Stream.of(list);
		 // print values 
        System.out.println("Values of Stream:"); 
        value.forEach(System.out::println);
         
     	ArrayList<Integer> list1 = new ArrayList<>();
     	list1.add(100);
     	list1.add(130);
     	list1.add(120);
     	list1.add(140);
     	list1.add(400);
     	list1.add(170);
     	
        Integer maxVal = list1.stream().max(Integer::compare).get();
        Integer minVAl = list1.stream().min(Integer::compare).get();
        System.out.println("maxValue :: "+maxVal);
        System.out.println("minValue :: "+minVAl);
	}

}
