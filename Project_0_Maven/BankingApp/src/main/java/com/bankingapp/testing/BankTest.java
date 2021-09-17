package com.bankingapp.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import models.Bank;

public class BankTest {
	
	private static Bank bank;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("Sinlge time before test methods in this class.");
	}
	
	@Before
	public void beforeEachTest() {}
	
	@Test
	public void sampleTest() {}
	
	@Test
	public void sampleTest2() {}
	
	@After
	public void afterEachTest() {}
	
	@AfterClass
	public void tearDown() {}
}
