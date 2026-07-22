package com.amazon.user;

public class User {

	private String userName;
	private String userId;
	private String mobile;
	private String email;

	static { // SIB ---> Static initialization block
		System.out.println("Static initialization Block");
	}
		
	{

		System.out.println("Instance initialization block");// IIB ---> Instance initialization block

	}

	public User(String _mobile) {

		this("XYZ", "Sar@123", _mobile, "Sar@gmail"); // Mandatory Fields / Attributes / Data
		System.out.println("User-1");
	}

	public User(String _userName, String _userId, String _mobile, String _email) {

		super();

		System.out.println("User-2");
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
		this.email = _email;

	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		User Sarvagay = new User("12345678");
		User Diksha = new User("98765432");

	}

}
