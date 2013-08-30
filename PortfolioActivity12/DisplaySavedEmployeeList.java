/* Datoon, Philip Bryan B.
 * 131311399
 * 26 August 2013
 */

import java.io.*;
import java.nio.file.*;

public class DisplaySavedEmployeeList {
	public static void main(String[] args) {
		Path file = Paths.get("EmployeeList.txt");
		String s;
		
		s = "";
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			
			while (s != null) {
				System.out.println("ID #" + s);
				s = reader.readLine();
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println("Message: " + e);
		}
	}
}