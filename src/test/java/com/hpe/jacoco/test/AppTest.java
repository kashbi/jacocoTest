package com.hpe.jacoco.test;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(37, obj.generateUniqueKey().length());
		obj.dummyFunction();

	}

	@Test
	public void testLengthOfTheUniqueKey2() {

		App obj = new App();
		Assert.assertEquals(37, obj.generateUniqueKey().length());
		obj.dummyFunction();

	}

	@Test
	public void testLengthOfTheUniqueKey3() {

		App obj = new App();
		Assert.assertEquals(37, obj.generateUniqueKey().length());
		obj.dummyFunction();

	}
}