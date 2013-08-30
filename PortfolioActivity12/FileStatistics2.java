/* Datoon, Philip Bryan B.
 * 131311399
 * 26 August 2013
 */

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics2 {
	public static void main(String[] args) {
		// declaring Path objects
		Path filePath1 = Paths.get("quote.txt");
		Path filePath2 = Paths.get("quote.docx");
		long fileSize1;
		long fileSize2;
		
		try {
			// declaring BasicFileAttributes objects
			BasicFileAttributes attr1 = Files.readAttributes(filePath1, BasicFileAttributes.class);
			BasicFileAttributes attr2 = Files.readAttributes(filePath2, BasicFileAttributes.class);
			
			System.out.println("File name\t\t"	+ filePath1.getFileName());
			System.out.println("Created on\t\t" + attr1.creationTime());
			System.out.println("Last modified on\t" + attr1.lastModifiedTime());
			System.out.println("File size\t\t" + attr1.size() + " bytes");
			fileSize1 = attr1.size();
			
			System.out.println();
			
			System.out.println("File name\t\t"	+ filePath2.getFileName());
			System.out.println("Created on\t\t" + attr2.creationTime());
			System.out.println("Last modified on\t" + attr2.lastModifiedTime());
			System.out.println("File size\t\t" + attr2.size() + " bytes");
			fileSize2 = attr2.size();
			
			System.out.println();
			System.out.println("The ratio of " + filePath1.getFileName() + " file size to that of " +
									 filePath2.getFileName() + " is: " + (attr1.size() / attr2.size()) + " bytes.");
									 
			System.out.println("The ratio of " + filePath2.getFileName() + " file size to that of " +
									 filePath1.getFileName() + " is: " + (attr2.size() / attr1.size()) + " bytes.");
		} catch (Exception e) {
			System.out.println("ERROR: File not found.");
		}
	}
}