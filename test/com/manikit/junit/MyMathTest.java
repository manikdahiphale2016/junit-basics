package com.manikit.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
// Absences of failure is success in Junit
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Runs before test class ");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Runs after  test class ");
	}
	
	@Before
	public void before() {
		System.out.println("Runs before each test ");
	}
	@After
	public void after() {
		System.out.println("Runs after each test ");
	}
	@Test
	public void sum_with3Numbers() {
		System.out.println("Test1");
		MyMath math = new MyMath();
		int result = math.sum(new int[] {1,2,3});
		assertEquals(6, result);
		
	}
	
	@Test
	public void sum_with1Number() {
		System.out.println("Test2");
		MyMath math = new MyMath();
		int result = math.sum(new int[] {33});
		assertEquals(33, result);
		
	}

}
