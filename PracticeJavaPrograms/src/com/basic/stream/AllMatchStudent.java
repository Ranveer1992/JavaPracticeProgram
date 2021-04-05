package com.basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	int stuId;
	int stuAge;
	String stuName;
	Student(int Id,int age,String name){
		this.stuId=Id;
		this.stuAge=age;
		this.stuName=name;
	}
	public static List<Student>getStudentList(){
		List<Student> list = new ArrayList<>();
		list.add(new Student(11,28,"Ranveer"));
		list.add(new Student(12,18,"Sachin"));
		list.add(new Student(13,38,"Dwarka"));
		list.add(new Student(14,48,"Rahul"));
		list.add(new Student(15,58,"Raja"));
		return list;
	}
}
public class AllMatchStudent {

	public static void main(String[] args) {
		Predicate<Student> p1 = s->s.stuName.startsWith("R");
		Predicate<Student> p2 = s->s.stuAge > 10;
		Predicate<Student> p3 = s->s.stuAge > 10 && s.stuName.startsWith("R");
		List<Student> list1 = Student.getStudentList();
		boolean b1 = list1.stream().allMatch(p1); 
	    System.out.println("list.stream().allMatch(p1): "+b1); 
	    boolean b2 = list1.stream().allMatch(p2); 
	    System.out.println("list.stream().allMatch(p2): "+b2); 
	    boolean b3 = list1.stream().allMatch(p3); 
	    System.out.println("list.stream().allMatch(p3): "+b3); 
	}

}
