/* Datoon, Philip Bryan B.
	131311399
	31 July 2013 */
	
import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount();
		BankAccount acct2 = new BankAccount();
		BankAccount acct3 = new BankAccount();
		BankAccount acct4 = new BankAccount();
		
		getData(acct1);
		getData(acct2);
		getData(acct3);
		
		showValues(acct1);
		showValues(acct2);
		showValues(acct3);
		showValues(acct4);
	}
	
	public static BankAccount getData(BankAccount acct) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Account number: ");
		acct.setAcctNum(sc.nextInt());
		
		System.out.print("Owner's name: ");
		acct.setOwnerName(sc.next());
		
		System.out.print("Account balance: ");
		acct.setAcctBalance(sc.nextInt());
		
		System.out.println();
		return acct;
	}
	
	public static BankAccount showValues(BankAccount acct) {
		System.out.println();
		System.out.println("Account number: " + acct.getAcctNum());
		System.out.println("Owner's name: " + acct.getOwnerName());
		System.out.println("Account balance: $" + acct.getAcctBalance());
		
		acct.setAcctBalance(acct.deductMonthlyFee());
		System.out.println(">> New account balance: $" + acct.getAcctBalance());
		acct.explainAccountPolicy();
		System.out.println();
		
		return acct;
	}
}