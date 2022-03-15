package addressbook;

import java.util.Scanner;

public class UC6 {

	public static void main(String[] args) {

		System.out.println("**********Phone Book**********");
		Scanner sc = new Scanner(System.in);
		AddServices add = new AddServices(); // created objects
		
		MultipleAddressBook multi = new MultipleAddressBook();
		
		while (true) {
			System.out.println("Enter to avail services: ");
			System.out.println(
					"1: To add contact \n2: To edit existing contact \n3: To delete contact "
					+ "\n4: To display contact list \n5: find contacts "
					+ " \n6.AddMultipleAddressBook \n7.multiaddcontacts \n8:displayMultiAddress \n9: To Exit");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				add.numberOfTimes();
				break;
			case 2:
				add.edit();
				break;
			case 3:
				add.delete();
				break;
			case 4:
				add.display();
				break;
			case 5:
				add.findContact();
				break;
	     	case 6:
				multi.AddMultipleAddressBook();
				break;
	    	case 7:
				multi.addingContacts();
				break;
	    	case 8:
				multi.printaddressBook();
				break;
			case 9:
				sc.close();
				return;
			}
		}

	}
}