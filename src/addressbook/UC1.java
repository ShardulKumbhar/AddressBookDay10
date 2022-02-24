package addressbook;

import java.util.function.LongToIntFunction;

class AddressBook {

	// methord creation
	void firstname(String firstname) // constructor
	{

		System.out.println("first name:" + firstname);
	}

	// methord creation
	void lastname(String lastname) // constructor
	{

		System.out.println("Last Name :" + lastname);
	}

	void city(String add) {
		System.out.println("address city :" + add);
	}

	void zip(Long zip) {
		System.out.println("zip code :" + zip);
	}

	void number(Long num) {
		System.out.println("number :" + num);
	}

	void email(String email) {
		System.out.println("Email :" + email);
	}

}

public class UC1 {

	public static void main(String[] args) {
		AddressBook a1 = new AddressBook();

		// methord calling by object
		a1.firstname("Roney");
		a1.lastname("Patil");
		a1.city("kolhapur");
		a1.zip(416502l);
		a1.number(7709986759l);
		a1.email("roney11@gmai.com");
	}

}