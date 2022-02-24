package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class Addressbook {

	void dataAdd() {

		// scanner to take user input
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<String> contacts = new ArrayList<String>();

			System.out.print("Enter First Name: ");
			String firstn = scanner.nextLine();
			contacts.add(firstn);

			System.out.print("Enter Last Name: ");
			String lastn = scanner.nextLine();
			contacts.add(lastn);

			System.out.print("Enter Address: ");
			String add = scanner.nextLine();
			contacts.add(add);

			System.out.print("Enter City: ");
			String city = scanner.nextLine();
			contacts.add(city);

			System.out.print("Enter State: ");
			String state = scanner.nextLine();
			contacts.add(state);

			System.out.print("Enter Zip Code: ");
			String zip = scanner.nextLine();
			contacts.add(zip);

			System.out.print("Enter Phone No: ");
			String phoneno = scanner.nextLine();
			contacts.add(phoneno);

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();
			contacts.add(email);

			// display or print a array list
			System.out.println("Contact Added");
			System.out.println(contacts);

			//userinput to remove contact by user name
			System.out.println("Enter the first name of contact you want to remove :");
			String fn1 = scanner.nextLine();

			if (fn1.equals(firstn)) {
				contacts.removeAll(contacts);
				System.out.println(contacts);
				System.out.println(contacts + "Empty Address Book");

			} else {
				System.out.println("NO contact exists by this name !!! Please try again");
			}
		}
	}
}

public class UC4 {

	public static void main(String[] args) {
		System.out.println("PhoneBook");
		// creating object
		Addressbook person1 = new Addressbook();
		// calling methord
		person1.dataAdd();

	}
}