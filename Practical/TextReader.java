/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - TextReader.java
 */

import java.io.*;
import java.nio.file.*;

public class TextReader {
   public static void main(String[] args) {
		Path file = Paths.get("message.txt");		
		String s;
		
		s = "";
		
		try {
			InputStream input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			
			while (s != null) {
				System.out.println(s);
				s = reader.readLine();
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(" ERROR: " + e);
		}
   }
}