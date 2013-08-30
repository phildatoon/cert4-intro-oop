/* Datoon, Philip Bryan B.
 * 131311399
 * 26 August 2013
 */

import java.io.*;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class WriteEmployeeList {
	public static void main(String[] args) {
		// file path
		Path file = Paths.get("EmployeeList.txt");
		Scanner sc = new Scanner(System.in);
		
		int listSize;
		
		System.out.print("Enter number of data you wish to add: ");
		listSize = sc.nextInt();
		System.out.println();
		
		// declaration of arrays
		int[] emp = new int[listSize];
		String[] firstName = new String[listSize];
		String[] lastName = new String[listSize];
		
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			
			for (int x = 0; x < listSize; x++) {
				System.out.print("Enter ID of employee " + (x + 1) + ": ");
				emp[x] = sc.nextInt();
				
				System.out.print("Enter first name of employee " + (x + 1) + ": ");
				firstName[x] = sc.next();
				
				System.out.print("Enter last name of employee " + (x + 1) + ": ");
				lastName[x] = sc.next();
				
				System.out.println();
	
				String empData = emp[x] + " " + firstName[x] + " " + lastName[x];
				writer.write(empData, 0, empData.length());
				writer.newLine();
			}
			
			writer.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
		}		
	}
}