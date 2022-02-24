package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class Addressbook {

	public String firstn, lastn, add, city, state, email, zip, phoneno, i;
	ArrayList<Addressbook> contacts = new ArrayList<Addressbook>();

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

	// ArrayList<String> contacts = new ArrayList<String>();

	void dataAdd() {
		Scanner scanner = new Scanner(System.in);
		// scanner to take user input
		while(true){

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

//			System.out.println(contacts + "\n");
//
			

			Addressbook newcontact = new Addressbook(firstn, lastn, add, city, state, email, zip, phoneno);

			contacts.add(newcontact);
			System.out.println(contacts);

		}
	}
}

public class UC5 {

	public static void main(String[] args) {

		System.out.println("........Welcome to PhoneBook.........");

		System.out.println("PhoneBook");
		
	Addressbook person1 = new Addressbook(null, null, null, null, null, null, null, null);
		
	

	
		for (int i = 1; i <= 2; i++) {
			person1.dataAdd();
		
		}
	}
}