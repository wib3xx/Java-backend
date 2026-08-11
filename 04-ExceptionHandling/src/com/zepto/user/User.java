package com.zepto.user;
/**
 * @author Sarvagay
 * **/
public class User {

	public void createUser(String userName, String password) {
		System.out.println("UserInfo START");
		String userId = null;
		
		try {
		
		 userId = userName.substring(0, 5)+ "123";
		 } 
		catch(Exception e) {
			System.out.println("User Id cannot be generated");
			e.getStackTrace();
		}
		
		System.out.println("UserInfo starts And User Id is generated: "+ userId + " Ends");
	}
}
