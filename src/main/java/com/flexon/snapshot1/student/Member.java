package com.flexon.snapshot1.student;


public class Member {
	

	private String firstName;
	private String lastName;
	private long number;
	private String email;
	
	
	public Member() {
		super();
	}
	
	public Member(String firstName, String lastName, long number, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	

}
