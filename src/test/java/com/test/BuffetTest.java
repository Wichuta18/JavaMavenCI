package com.test;

import java.nio.Buffer;

import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

import junit.framework.Assert;

public class BuffetTest {
	public int number;
	public Buffet buf;
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
	}
	
	@Test
	public void getNumberFromSetNumberByNumber5() {
		this.number = 5;
		
		int expected = 5;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getNumberFromSetNumberByNumber10() {
		this.number = 10;
		
		int expected = 10;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getNumberFromSetNumberByNumber6() {
		this.number = 6;
		
		int expected = 6;
		
		buf.setNumber(this.number);
		int actual = buf.getNumber();
		
		Assert.assertEquals(expected, actual);
	}
}

