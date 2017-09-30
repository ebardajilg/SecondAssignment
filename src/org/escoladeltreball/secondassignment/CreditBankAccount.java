/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author pep
 *
 */
public class CreditBankAccount extends BankImpl {

	public CreditBankAccount(String owner, double balance) {
		super(owner, balance);
	}

	@Override
	public void withdraw(double euros) throws Exception {
		if (euros > 0) {
			if (balance - euros >= Bank.MIN_BALANCE) {
				balance -= euros;
			} else {
				throw new Exception("Insufficient balance Exception");
			}
		}
	}

}
