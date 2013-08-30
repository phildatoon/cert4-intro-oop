/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - TextWriter.java
 */

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class TextWriter {
   public static void main(String[] args) {
		Path file = Paths.get("message.txt");
		Scanner sc = new Scanner(System.in);
		
		String message = "";
      int spaceCtr;
      boolean isValid = true;
		
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, APPEND));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
         
         do {
            System.out.print("Enter a message: ");
            message = sc.nextLine();
            
            spaceCtr = 0;
         	
            if (message.length() < 15) {
               // checks message length
               System.out.println(" ERROR: Message too short, must be at least 15 characters.");
               isValid = false;
            } else if (!message.contains(" ")) {
               // checks if string is a single word
               System.out.println(" ERROR: Message is a single word.");
               isValid = false;
            } else if (message.contains(" ")) {
               /* Message considered invalid if it has only one
                * space, which is then located either at the start or
                * at the end of the message.
                */
               for (int x = 0; x < message.length(); x++) {
                  // counts number of spaces
                  if (message.charAt(x) == (' ')) {
                     spaceCtr++;
                  }
               }
               
               if (spaceCtr <= 1) {
                  if (message.startsWith(" ")) {
                     System.out.println(" ERROR: Message starts with a space" +
                                        " and is still a single word.");
                     isValid = false;
                  } else if (message.endsWith(" ")) {
                     System.out.println(" ERROR: Message ends with a space" +
                                        " and is still a single word.");
                     isValid = false;
                  } else {
                     isValid = true;
                  }
               } else {
                  isValid = true;
               }
            }
         } while (!isValid);
         
		   writer.write(message, 0, message.length());
         writer.newLine();
         
         writer.close();
		} catch (Exception e) {
			System.out.println(" ERROR: " + e);
		}
   }
}