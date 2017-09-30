/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author pep
 *
 */
public class CashBankAccount extends BankImpl {

	public CashBankAccount(String owner, double balance) {
		super(owner, balance);
	}

	@Override
	public void withdraw(double euros) throws Exception {
		if (euros > 0) {
			if (balance > euros) {
				balance -= euros;
			} else {
				throw new Exception("Insufficient balance Exception");
			}
		}
	}

}
