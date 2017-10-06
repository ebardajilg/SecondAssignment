/**
 * 
 */
package org.escoladeltreball.secondassignment;

/**
 * @author iaw39443990
 *
 */
public class CashBankAccount extends BankImpl {
	public CashBankAccount(String owner, double balance) {
		super(owner, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double euros) throws Exception {
		if (euros > 0) {
			if(balance > euros) {
				balance -= euros;
			}else {
				throw new Exception("No balance");
			}
		}
		
	}
}
