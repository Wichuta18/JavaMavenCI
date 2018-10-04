package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ExampleTest {

	@Test 
	public void test() {
		//init value
		int score = 80;
		
		//Expected
		String expected = "A";
		
		//Ectual
		String actual = "A";
		
		//Test
		Assert.assertEquals(expected, actual);
	}

}
