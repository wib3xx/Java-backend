package com.oops.serialization_and_deserialization.practice1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//object creation
		Account acc = new Account(10000, "Sarvagay_Sanmotra" , "123@123" , "Banglore");
		//TO -Do --> Send acc object to network / write file/database
		
		//Here we have written object to file
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		
		//Adding ObjectOutputStream oos to file --> Serialization
		
		oos.writeObject(acc);
		System.out.println("Serialization Done!!");
	}
}
