/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * UC11 - Ability to sort the entries in the
 * address book alphabetically by
 * Person’s name
 */

public class Contact {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String emailId;	

	//Parameterized Contact constructor
	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Method for displaying data
	public void displayContact() {
		System.out.println();
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Zip : "+zip);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email Id : "+emailId);
	}
	
}
