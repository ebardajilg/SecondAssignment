/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw39443990
 *
 */
public class CreditBankAccount extends BankImpl{

	public CreditBankAccount(String owner, double balance) {
		super(owner, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double euros) throws Exception {
		if (euros > 0) {
			if(balance >= MIN_BALANCE) {
				balance -= euros;
			}else {
				throw new Exception("No balance");
			}
		}
	}
	
	
}
