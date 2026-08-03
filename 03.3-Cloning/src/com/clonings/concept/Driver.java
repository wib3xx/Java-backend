package com.clonings.concept;

class Address{
	String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;
	}
	
}
class Employee{
	String name;
	Address address;
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	} 
	
}
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Sarvagay@123", new Address("Banglore, KA, IND"));
		
		Employee e2 =(Employee) e1.clone();
		System.out.println("Name: "+e2.name);
		System.out.println("Address: "+e2.address);
	}
}
