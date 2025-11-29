package com.mphasis;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	@Test
	public void addTest()
	{
		assertEquals(5, new Calculator().add(2, 3));
		
	}
	@Test
	public void subTest()
	{
		assertEquals(-1, new Calculator().sub(2, 3));
	}
	@Test
	public void mulTest()
	{
		assertEquals(6, new Calculator().mul(2, 3));
	}
	@Test
	public void divTest()
	{
		assertEquals(2, new Calculator().div(10, 5));
	}
	@Test
	public void isEvenTest()
	{
		assertTrue(new Calculator().isEven(4), "for input 4 reults must be true");
	}
	@Test
	public void checkArrayTest()
	{
		int brr[]= {1,2,3,4,5};
		assertArrayEquals(brr, new Calculator().checkArrays());
		//assertSame(brr, new Calculator().checkArrays());--flase
	}
	@Test
	public void checkAETest()
	{
		//Assertions.assertEquals(new Calculator().checkAE(), new ArithmeticException()); //false bcz compares two ref
		
		assertTrue(new Calculator().checkAE() instanceof ArithmeticException);
	}
	
	@BeforeAll
	public static void beforeEveryTest()
	{
		System.out.println("Testing of api started");
	}
	@AfterAll
	public static void afterEach()
	{
		System.out.println("testing  of api completed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
