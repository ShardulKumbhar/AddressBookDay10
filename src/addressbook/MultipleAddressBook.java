package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBook {

	Map<String , AddServices> addressBookSystem =new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public void AddMultipleAddressBook()
	{
		System.out.println("Enter the name of address book :");

		String bookName = sc.next();

		// addressBookSystem.put(bookName, service);
		if (addressBookSystem.containsKey(bookName)) {
			System.out.println("Book Already Exists");
		} else {
			AddServices service = new AddServices();
			addressBookSystem.put(bookName, service);
			System.out.println("created new address book");

		}
	}

	public void addingContacts() {
		System.out.println("Enter name of adress book you want to add contatcts in");
		String existingBook = sc.next();
		//System.out.println(existingBook);
		addressBookSystem.get(existingBook);
		if(existingBook == null)
		{
			System.out.println("Book Not Exist");
		}
		else {
			addressBookSystem.get(existingBook).addPerson();
		}

	}
	 public void printaddressBook() {
		 for( String i : addressBookSystem.keySet()) {
		 System.out.println(i);
		 System.out.println(addressBookSystem.get(i).contacts);
	 }
	 
	 }

}