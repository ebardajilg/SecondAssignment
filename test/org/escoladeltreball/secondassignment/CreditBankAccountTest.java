package org.escoladeltreball.secondassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CreditBankAccountTest {

	private Bank creditAccount;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		creditAccount = new CashBankAccount("Erik",1000);
	}

	@After
	public void tearDown() throws Exception {
		creditAccount = null;
	}

	@Test
	public final void testWithdraw() {
		try {
			creditAccount.withdraw(1100.0);
			assertEquals(-100.0, creditAccount.getBalance(), 1.0e-4);
		} catch (Exception e) {
			e.printStackTrace();
			// o tambien -> System.out.println(e.printStackTrace(););
		}		
	}
	
	@Test(expected = Exception.class)
	public final void testWithdrawException() throws Exception {
		creditAccount.withdraw(1300.1);
	}



}
