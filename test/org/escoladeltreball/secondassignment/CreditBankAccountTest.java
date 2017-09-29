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

	private static Bank creditAccount; // = new CreditBankAccount();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		creditAccount = new CreditBankAccount("Joan", 1000);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		creditAccount = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link org.escoladeltreball.secondassignment.BankImpl#withdraw(double)}.
	 */
	@Ignore
	@Test
	public final void testWithdraw() {
		fail("Not yet implemented"); // TODO
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
