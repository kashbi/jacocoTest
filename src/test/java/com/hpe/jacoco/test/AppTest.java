package com.hpe.jacoco.test;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(39, obj.generateUniqueKey().length());
		obj.dummyFunction();

	}
}