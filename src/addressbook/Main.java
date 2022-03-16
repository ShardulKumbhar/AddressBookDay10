package addressbook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * PROCEDURE
		 * ===============================================================================
		 * 1.created add object of class 
		 *  2.created multi object of class 
		 * 3.Creating while loop for user choice 
		 * 4..creating a list of services available and printing at start of program
		 * 5..calling method with refrance to objects to implement operations
		 * ================================================================================
		 */

		System.out.println("**********Phone Book**********");
		Scanner sc = new Scanner(System.in);
		/*
		 * 1.created add object of class
		 */
		AddServices add = new AddServices(); // created objects
		/*
		 * 2.created multi object of class
		 */
		MultipleAddressBook multi = new MultipleAddressBook();

		/*
		 * 3.Creating while loop for user choice
		 * 4..creating a list of services
		 *   available and printing at start of program 
		 * 5..calling method with refrance to
		 *    objects to implement operations
		 * 
		 */

		while (true) {
			System.out.println("\nEnter to avail services: ");
			System.out.println("\n1: To add contact \n2: To edit existing contact \n3: To delete contact "
					+ "\n4: To display contact list \n5: find contacts "
					+ " \n6: Add Multiple Address Book \n7: Add Contact to multi Address Book \n8: display Multiple Address book \n0: To Exit");

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
			case 0:
				sc.close();
				return;
			}
		}

	}
}