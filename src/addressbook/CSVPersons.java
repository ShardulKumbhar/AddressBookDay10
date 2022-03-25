package addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVPersons {
	public static Scanner sc = new Scanner(System.in);
	
	
	/**
	 * PROCEDURE
	 * ==============================================
	 * 1.created method to to read csv file
	 * 2.try catch block to check file exists or not
	 * 3.Scanning the file path
	 * 4.creating a loop to pop out every string values
	 * 5.created method to write in csv file
	 * 6.try catch block to check file exists or not
	 * 7.creation object of file writer
	 * 8.creating object of print writer
	 * 9.Switch Cases to make a choice for user
	 * 10.calling Static method to read and write
	 * @param filePath-path where we can read and write 
	 * ===============================================
	 */
	
	
	/*
	 * 1.created method to to read csv file
	 */
	public static void readCSVfileUsingScanner(String filePath) {
		/*
		 * 2.try catch block to check file exists or not
		 */
		try {
			/*
			 * 3.Scanning the file path
			 */
			Scanner sc = new Scanner(new File(filePath));

			/*
			 * 4.creating a loop to pop out every string values
			 */
			while (sc.hasNext()) {
				System.out.println("User data  :" + sc.next().toString());
			}
			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void numberOfTimes() {
		System.out.println("Enter the Number of Contacts to Enter");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			writeCSVfileUsingScanner();
		}
		System.out.println("something went wrong!!!");
	}

	/*
	 * 5.created method to write in csv file
	 */
	public static void writeCSVfileUsingScanner() {

		File file = new File("C:\\Users\\shard\\eclipse-workspace\\AddreesBookDay10\\AddressBookDay10\\src\\Book3.csv");
//we can csv as well as txt file to store
		/*
		 * 6.try catch block to check file exists or not
		 */
		try {
			/*
			 * 7.creation object of file writer
			 */
			FileWriter fileWriter = new FileWriter(file);

			/*
			 * 8.creating object of print writer
			 */
			PrintWriter printWriter = new PrintWriter(fileWriter);

			System.out.println("Enter the First name :");
			String a = sc.nextLine();
			System.out.println("Enter the Last name :");
			String b = sc.nextLine();
			System.out.println("Enter the Address :");
			String c = sc.nextLine();
			System.out.println("Enter the city :");
			String d = sc.nextLine();
			System.out.println("Enter the state :");
			String e = sc.nextLine();
			System.out.println("Enter the zipCode :");
			String f = sc.nextLine();
			System.out.println("Enter the phoneNumber :");
			String g = sc.nextLine();
			System.out.println("Enter the emailID :");
			String h = sc.nextLine();

			printWriter.print(a);
			printWriter.print(",");
			printWriter.print(b);
			printWriter.print(",");
			printWriter.print(c);
			printWriter.print(",");
			printWriter.print(d);
			printWriter.print(",");
			printWriter.print(e);
			printWriter.print(",");
			printWriter.print(f);
			printWriter.print(g);
			printWriter.print(",");
			printWriter.print(h);

			printWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		/*
		 * 9.Switch Cases to make a choice for user
		 */
		while (true) {
			System.out.println("Enter \n 1. Read csv file \n2.Write csv file \n0.exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {

			/*
			 * 10.calling Static method to read and write
			 */
			case 1:
				readCSVfileUsingScanner(
						"C:\\Users\\shard\\eclipse-workspace\\AddreesBookDay10\\AddressBookDay10\\src\\Book2.csv");

				break;
			case 2:
				writeCSVfileUsingScanner();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
			}
		}

	}
}