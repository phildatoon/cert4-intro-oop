/* Datoon, Philip Bryan B.
	131311399
	31 July 2013 */
	
public class BankAccount {
	private int acctNum;
	private String ownerName;
	private double acctBalance;
	
	BankAccount() {
		acctNum = 131311399;
		ownerName = "Philip Bryan Datoon";
		acctBalance = 90000.00;
	}
		
	public int getAcctNum() {
		return acctNum;
	}
	
	public void setAcctNum(int num) {
		acctNum = num;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	public double getAcctBalance() {
		return acctBalance;
	}
	
	public void setAcctBalance(double balance) {
		acctBalance = balance;
	}
	
	public double deductMonthlyFee() {
		double newAcctBalance;
		
		newAcctBalance = getAcctBalance() - 4.00;
		return newAcctBalance;
	}
	
	public static void explainAccountPolicy() {
		System.out.println("Due to our existing deduction policy, " +
								"please note that a $4.00 service fee " +
								"applies each month.");
	}
}