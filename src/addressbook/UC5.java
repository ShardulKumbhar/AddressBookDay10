package addressbook;


import java.util.ArrayList;
import java.util.Scanner;

class Addressbook {

	// variable assigne for string
	public String firstn, lastn, add, city, state, email, zip, phoneno, i;
	ArrayList<Addressbook> contacts = new ArrayList<Addressbook>();

	// constructor of paramatric
	public Addressbook(String firstn, String lastn, String add, String city, String state, String email, String zip,
			String phoneno) {
		super();
		this.firstn = firstn;
		this.lastn = lastn;
		this.add = add;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneno = phoneno;

	}

	@Override
	public String toString() {
		return "\nAddressbook [firstn=" + firstn + ", lastn=" + lastn + ", add=" + add + ", city=" + city + ", state="
				+ state + ", email=" + email + ", zip=" + zip + ", phoneno=" + phoneno + "]";

	}

	// methord
	void dataAdd() {
		Scanner scanner = new Scanner(System.in);
		// scanner to take user input
		while (true) {

			System.out.print("Enter First Name: ");
			String firstn = scanner.nextLine();

			System.out.print("Enter Last Name: ");
			String lastn = scanner.nextLine();

			System.out.print("Enter Address: ");
			String add = scanner.nextLine();

			System.out.print("Enter City: ");
			String city = scanner.nextLine();

			System.out.print("Enter State: ");
			String state = scanner.nextLine();

			System.out.print("Enter Zip Code: ");
			String zip = scanner.nextLine();

			System.out.print("Enter Phone No: ");
			String phoneno = scanner.nextLine();

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();

			Addressbook newcontact = new Addressbook(firstn, lastn, add, city, state, email, zip, phoneno);

			// printing the array list
			contacts.add(newcontact);
			System.out.println(contacts);
			break;
		}
	}
}

public class UC5 {

	public static void main(String[] args) {

		// printing
		System.out.println("........Welcome to PhoneBook.........");
		System.out.println("How many persons data you want to Enter ");

		// created object to call constructor
		Addressbook person1 = new Addressbook(null, null, null, null, null, null, null, null);

		// taking input from user
		Scanner p1 = new Scanner(System.in);
		int howmany = p1.nextInt();

		// looping the methord/construtor to add person data in arraylist
		for (int i = 1; i <= howmany; i++) {
			person1.dataAdd();
		}
	}
}