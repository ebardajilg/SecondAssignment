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
public class CashBankAccountTest {

	private Bank cashAccount; // = new CashBankAccount();

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
		cashAccount = new CashBankAccount("Ana", 1000);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cashAccount = null;
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#withdraw(double)}.
	 */
	@Test
	public final void testWithdraw() {
		try {
			cashAccount.withdraw(500.0);
			assertEquals(500.0, cashAccount.getBalance(), 1e-4);
			cashAccount.withdraw(125.0);
			assertEquals(375.0, cashAccount.getBalance(), 1e-4);
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
		cashAccount.withdraw(1000.0);
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#deposit(double)}.
	 */
	@Ignore
	@Test
	public final void testDeposit() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#toDollars()}.
	 */
	@Ignore
	@Test
	public final void testToDollars() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#getBalance()}.
	 */
	@Ignore
	@Test
	public final void testGetBalance() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#isBalanceNegative()}.
	 */
	@Ignore
	@Test
	public final void testIsBalanceNegative() {
		fail("Not yet implemented"); // TODO
	}

}
