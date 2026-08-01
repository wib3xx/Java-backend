package com.oops.serialization.concept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Create object !!
		
		Account acc = new Account(12000, "Sarvagay", "123@123", "Banglore");
	
		// TODO - Send acc to Network / write to a file system / Send to database
		
		// We will write object to a file system
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		
		//Add oos object to the file (acc.ser) --> Serialization
		
		oos.writeObject(acc);
		System.out.println("Serialization done :-) ");
	}
}
