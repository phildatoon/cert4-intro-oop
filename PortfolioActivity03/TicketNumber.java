/* Datoon, Philip Bryan B.
 * 131311399
 * 29 July 2013 */

import java.util.Scanner;

public class TicketNumber {
	public static void main(String[] args) {
		String ticketStr;
		int ticketNum;
		int lastTicketNum;
		int remainder;
		boolean isEqualTo4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ticket number: ");
		
		ticketStr = sc.next();
		ticketNum = Integer.parseInt(ticketStr.substring(0,5));	// removes last digit
		
		// ticketNum = Integer.parseInt(ticketStr);
		// ticketNum = ticketNum / 10;
		
		lastTicketNum = Integer.parseInt(ticketStr) % 10;			// gets last digit
		remainder = ticketNum % 7;
		
		isEqualTo4 = (remainder == lastTicketNum);					// compares remainder and last digit
		
		System.out.print(ticketStr + " = " + isEqualTo4);			// result
		 
	}
}