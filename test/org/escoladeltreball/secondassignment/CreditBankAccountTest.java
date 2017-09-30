/**
 * 
 */
package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author pep
 *
 */
public class CreditBankAccountTest {

	private Bank creditAccount; 

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		creditAccount = new CreditBankAccount("Joan", 1000);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		creditAccount = null;
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#withdraw(double)}.
	 */
	@Test
	public final void testWithdraw() {
		try {
			creditAccount.withdraw(1100.0);
			assertEquals(-100.0, creditAccount.getBalance(), 1.0e-4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#withdraw(double)}.
	 */
	@Test(expected = Exception.class)
	public final void testWithdrawException() throws Exception {
		creditAccount.withdraw(1300.1);
	}
}
