/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw39443990
 *
 */
public abstract class BankImpl implements Bank{

	private String owner;
	protected double balance;

	public BankImpl(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double euros) {
		if (euros > 0) {
			balance += euros;
		}
	}
	
	public double toDollars() {
		return balance * Bank.DOLAR_RATE;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean isBalanceNegative() {
		return balance < 0;
	}

}
