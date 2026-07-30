package com.oops.serialization_and_deserialization.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		Account account = (Account) ois.readObject();
		System.out.println("De-Serialization Done");
		System.out.println("Account: "+ account.getBalance()+" "+ account.getName()+" "+ account.getPassword()+ " "+ account.getLocation() );
}
}
