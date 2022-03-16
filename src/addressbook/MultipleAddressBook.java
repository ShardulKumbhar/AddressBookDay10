package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * steps
 * =============================================================
 *  1.Method to save in HashMap in key value pair
 * 2. Method to add multiple address book to adderess book
 * 3.method to add person contatcts in multiple address book
 * 4.Method to print multiple address book
 * ============================================================
 */
public class MultipleAddressBook {

	/*
	 * 1.Method to save in HashMap in key value pair
	 */
	Map<String, AddServices> addressBookSystem = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	/*
	 *2. Method to add multiple address book to adderess book
	 */
	public void AddMultipleAddressBook() {
		System.out.println("Enter the name of address book :");

		String bookName = sc.next();

		if (addressBookSystem.containsKey(bookName)) {
			System.out.println("Book Already Exists");
		} else {
			AddServices service = new AddServices();
			addressBookSystem.put(bookName, service);
			System.out.println("created new address book");

		}
	}

	/*
	 * 3.method to add person contatcts in multiple address book
	 */
	public void addingContacts() {
		System.out.println("Enter name of adress book you want to add contatcts in");
		String existingBook = sc.next();
		
		addressBookSystem.get(existingBook);
		try {
		if (existingBook == null) {
			System.out.println("Book Not Exist");
		} else {
			addressBookSystem.get(existingBook).addPerson();
		}
		}catch(NullPointerException e){
			System.out.println("Book not Exist..try again");
		}
			
		}

	

	/*
	 * 4.Method to print multiple address book
	 */
	public void printaddressBook() {
		for (String i : addressBookSystem.keySet()) {
			System.out.println(i);
			System.out.println(addressBookSystem.get(i).contacts);
		}
	}

}