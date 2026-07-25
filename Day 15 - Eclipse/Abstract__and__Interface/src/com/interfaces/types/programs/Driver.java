package com.interfaces.types.programs;

class Employee implements Cloneable {

/* @author is me
 * */	
		String name;
		String location;
		
	public Employee(String name, String location) {
			super();
			this.name = name;
			this.location = location;
		}

	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

/*@author is someone else */
public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee e1 = new Employee("Sarvagay", "Banglore");
		
		Employee e2 = (Employee) e1.clone();
		System.out.println(e2.location + " "+ e2.name);
		
		GoldUser goldUser = new GoldUser();
		if(goldUser instanceof User) {
			System.out.println("GoldUser is a type of real user");
		} else {
			System.out.println("No, Gold user is not type of User");
		}
	}
}
