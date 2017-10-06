package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CashBankAccountTest {

	private Bank cashAccount;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cashAccount = new CashBankAccount("Erik",1000);
	}

	@After
	public void tearDown() throws Exception {
		cashAccount = null;
	}

	@Test
	public final void testWithdraw() throws Exception {
		cashAccount.withdraw(100.0);
	}

	@Test
	public final void testDeposit() {
		cashAccount.deposit(10.0);
		assertEquals(1010.0, cashAccount.getBalance(), 1e-4);
	}

	@Test
	public final void testToDollars() {
		assertEquals(1400.0, cashAccount.toDollars(), 1e-4);
	}

	@Test
	public final void testGetBalance() {
		try {
			cashAccount.withdraw(1.99);
			cashAccount.deposit(1.99);
			assertEquals(1000.0, cashAccount.getBalance(), 1.0e-4);
		} catch (Exception e) {
			e.printStackTrace();
			// o tambien -> System.out.println(e.printStackTrace(););
		}
	}

	@Test
	public final void testIsBalanceNegative() {
		try {
			cashAccount.withdraw(1.99);
			cashAccount.deposit(1.99);
			assertEquals(1000.0, cashAccount.getBalance(), 1.0e-4);
		} catch (Exception e) {
			e.printStackTrace();
			// o tambien -> System.out.println(e.printStackTrace(););
		}
	}

}
