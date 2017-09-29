/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author pep
 *
 */
public interface Bank {
	/*
	 * This constant is used to convert from euro to dollar currency
	 */
	public static final double DOLAR_RATE = 1.4;

	/*
	 * This constant is the minimum balance a credit bank account can ever
	 * register
	 */
	public static final double MIN_BALANCE = -300.0;

	/**
	 * This method will extract euros from the current balance
	 * 
	 * @param euros
	 *            Quantity to withdraw (retirar) in euros
	 * @throws Exception
	 *             if balance is not enough
	 */
	public abstract void withdraw(double euros) throws Exception;

	/**
	 * This method will add euros to the current balance
	 * 
	 * @param euros
	 *            Quantity of money to withdraw
	 */
	public abstract void deposit(double euros);

	/**
	 * This method computes balance en dollars
	 * 
	 * @return The current amount of money in dollars
	 */
	public abstract double toDollars();

	/**
	 * This method returns the balance of this instance
	 * 
	 * @return The balance of the current instance in euro
	 */
	public abstract double getBalance();

	/**
	 * This method returns true if balance is negative, false otherwise
	 * 
	 * @return True if the current balance is negative, false otherwise
	 */
	public abstract boolean isBalanceNegative();

}
