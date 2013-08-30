/* Datoon, Philip Bryan B.
 * 131311399
 * 26 August 2013
 */

import java.io.*;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class DisplaySelectedFirstNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Path file = Paths.get("EmployeeList.txt");
		
		boolean isFound = false;
		String firstName;
		String s;
		
		s = "";
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			System.out.print("Enter first name of the employee you wish to display: ");
			firstName = sc.next();
			
			s = reader.readLine();
			
			do {
				if (s.contains(firstName)) {
					System.out.println("ID #" + s);
					s = reader.readLine();
					isFound = true;
				} else {
					s = reader.readLine();
				}
			} while (s != null);
			
			reader.close();
			
			if (!isFound)
				System.out.println(" - Employee with first name \"" + firstName + "\" does not exist.");
		} catch (Exception e) {
			System.out.println("Message: " + e);
		}
	}
}