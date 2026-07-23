package com.strings.day2;

class Employee{
	
}

public class Driver4 {

	public static void main(String[] args) {
		Employee e1 = new Employee();   //Stores in Heap
		Employee e2 = new Employee();	//Stores in Heap
		
			System.out.println(e1 == e2);
			System.out.println(e1.equals(e2));
		
	}
	
}
