package com.hpe.jacoco.test;

//aaa11

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
		//comment12345678911s99ssssdasddd
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
