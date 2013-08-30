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

public class DisplaySelectedIDNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Path file = Paths.get("EmployeeList.txt");
		
		boolean isFound = true;
		String empID;
		String s;
		
		s = "";
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			System.out.print("Enter employee ID you wish to display: ");
			empID = sc.next();
			
			s = reader.readLine();
			
			do {
				if (s.startsWith(empID)) {
					System.out.println("ID #" + s);
					isFound = true;
					break;
				} else {
					isFound = false;
					s = reader.readLine();
				}
			} while (!isFound && s != null);
			
			reader.close();
			
			if (!isFound)
				System.out.println(" - Employee ID does not exist.");
		} catch (Exception e) {
			System.out.println("Message: " + e);
		}
	}
}