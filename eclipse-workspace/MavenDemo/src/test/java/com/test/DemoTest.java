package com.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {

	@Test
	public void sum() {
		int a = 10;
		int b = 20;
		System.out.println("SUM");
		Assert.assertEquals(30, a + b);
	}

	@Test
	public void sub() {
		int a = 10;
		int b = 20;
		System.out.println("SUB");
		Assert.assertEquals(10, b - a);
	}

	@Test
	public void div() {
		int a = 10;
		int b = 20;
		System.out.println("DIV");
		Assert.assertEquals(2, b / a);
	}
}