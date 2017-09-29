/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author pep
 *
 */
public abstract class BankImpl implements Bank {

	private String owner;
	private double balance;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.secondassignment.Bank#withdraw(double)
	 */
	@Override
	public abstract void withdraw(double euros) throws Exception;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.secondassignment.Bank#deposit(double)
	 */
	@Override
	public void deposit(double euros) {
		balance += euros;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.secondassignment.Bank#toDollars()
	 */
	@Override
	public double toDollars() {
		return balance * Bank.DOLAR_RATE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.secondassignment.Bank#getBalance()
	 */
	@Override
	public double getBalance() {
		return balance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.secondassignment.Bank#isBalanceNegative()
	 */
	@Override
	public boolean isBalanceNegative() {
		return balance < 0;
	}

}
