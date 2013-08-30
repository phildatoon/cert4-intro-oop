/* Datoon, Philip Bryan B.
 * 131311399
 * 14 August 2013
 */

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// declaring parallel arrays
		String[] name = new String[20];
		String[] phoneNum = new String[20];
		
		int nameCtr;
		String search;
		boolean isZZZ = false;
		boolean isFound = false;
		
		System.out.println("PHONE BOOK (enter \"zzz\" to stop input)");
		System.out.println();
		
		// does the (user input) loop until string "zzz" is being entered
		do {
			for (int x = 0; x < name.length; x++) {			
				System.out.print("Name # " + (x + 1)+ ": \t");
				name[x] = sc.next();
			
				if (name[x].equals("zzz")) {
					isZZZ = true;
					break;
				}
				
				System.out.print("Phone no #" + (x + 1)+ ": \t");
				phoneNum[x] = sc.next();
			
				if (phoneNum[x].equals("zzz")) {
					// disallows "zzz" in phone number, thus name[x] is set to "zzz"
					name[x] = "zzz";
					isZZZ = true;
					break;
				}
				
				System.out.println("---------------------------------");
			}
		} while (!isZZZ);
		
		// displays how many names entered
		nameCtr = 0;
		
		for (int x = 0; x < name.length; x++) {
			if (name[x].equals("zzz") || name[x].isEmpty()) {
				// breaks loop if "zzz" or null value found in name[x]
				nameCtr = x;
				break;
			}
		}
		
		System.out.println();
		System.out.println("There are " + nameCtr + " names in your phone book.");
		System.out.println();
		
		// displays all elements with names
		for (int x = 0; x < nameCtr; x++) {
			System.out.println((x + 1) + " -- " + name[x] + "\t" + phoneNum[x]);
		}
		
		System.out.println();
		System.out.println("SEARCH NAME:");
		System.out.print("Type name: ");
		search = sc.next();
		
		// searches for names then display its name/phone number
		for (int x = 0; x < nameCtr; x++) {
			if (name[x].equals(search)) {
					System.out.println();	
					System.out.println("Entry found.");
					System.out.println("- Name: " + name[x]);
					System.out.println("- Phone number: " + phoneNum[x]);
					isFound = true;
					break;
			} else {
					isFound = false;
			}
		}
		
		if (!isFound) {
			System.out.println();
			System.out.println("Entry not found.");
		}
	}
}