package com.blz.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contacts> person;

	// constructor
	public AddressBookSystem() {
		person = new ArrayList<Contacts>();
	}

	// add new person record to array list after taking input

	public Contacts addPerson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		// creating constructor
		Contacts contacts = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);

		// add the above list to to Contacts array list
		person.add(contacts);

		// printing contacts object data inside
		System.out.println(contacts);

		return contacts;

	}// end of add person method

	// Edit contact details using person name
	public void editPerson() {
		System.out.println("Enter name to Edit");
		String s = scanner.next();
		AddressBookSystem addressbook = new AddressBookSystem();

		for (int i = 0; i < person.size(); i++) {
			Contacts p = (Contacts) person.get(i);
			if (s.equals(p.getFirstName())) {
				System.out.println(p);
				p = addressbook.addPerson();/// calling add person to replace

				for (int j = 0; j < person.size(); j++) {
					person.set(j, p);
				}

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in AddressBookMain class");
		AddressBookSystem ab = new AddressBookSystem();
		ab.addPerson();
		ab.editPerson();
	}
}
