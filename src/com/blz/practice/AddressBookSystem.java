package com.blz.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to the address book system");
		ArrayList<Contact> collection = new ArrayList<Contact>();
		try (Scanner sc = new Scanner(System.in)) {
			try (Scanner sc1 = new Scanner(System.in)) {
				int choice;
				do {
					System.out.println("1.INSERT");
					System.out.println("2.DISPLAY");
					System.out.println("Enter your  choice");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter First Name: ");
						String firstName = sc1.nextLine();
						System.out.print("Enter last Name: ");
						String lastName = sc1.nextLine();
						System.out.print("Enter your address: ");
						String address = sc1.nextLine();
						System.out.print("Enter your city: ");
						String city = sc1.nextLine();
						System.out.print("Enter your state: ");
						String state = sc1.nextLine();
						System.out.print("Enter zip code : ");
						int zip = sc.nextInt();
						System.out.println("Enter phone number: ");
						String phoneNumber = sc1.nextLine();
						System.out.print("Enter your EMail ID: ");
						String emailId = sc1.nextLine();
						Contact contactDetails = new Contact(firstName, lastName, address, city, zip, state,
								phoneNumber, emailId);
						collection.add(contactDetails);
						break;
					case 2:

						System.out.print(collection + "\n");
						break;

					}

				} while (choice != 0);
			}
		}
	}
}
