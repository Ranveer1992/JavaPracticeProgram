package com.Basic;

public class Employee {
	String firstname,lastname,salary;
	static int num = 10000;
	static String str = "Hello this is a static string.";
	static{
		num = 2000000;
		str = "change String";
	}
	Employee(String fname,String lname,String salary){
		this.firstname = fname;
		this.lastname = lname;
		this.salary = salary;
	}
	public void disp(){
		System.out.println("Fname => "+firstname);
		System.out.println("Lname => "+lastname);
		System.out.println("Salary => "+salary);
	}
	static void staticMethod(){
		System.out.println("This is a static method......");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		Employee obj1 = new Employee("Ranveer","Lodhi","2500");
		obj1.disp();
		Employee obj2 = new Employee("Sanjay","Kumar","2500");
		obj2.disp();
		//print static variable
		System.out.println("Number is : "+num);
		System.out.println("String is :"+str);
	}

}
