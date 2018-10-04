package com.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.main.Calculate;

import junit.framework.Assert;

public class CalculateTest {

	public int score;
	public Calculate cal ;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	
	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndClaculateByScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void gradeAFromSetScoreAndClaculateByScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeAFromSetScoreAndClaculateByScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeBPlusFromSetScoreAndClaculateByScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeBPlusFromSetScoreAndClaculateByScore79() {
		this.score = 79;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
	@Test
	public void gradeBFromSetScoreAndClaculateByScore74() {
		this.score = 74;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCPlusFromSetScoreAndClaculateByScore66() {
		this.score = 66;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCFromSetScoreAndClaculateByScore62() {
		this.score = 62;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDPlusFromSetScoreAndClaculateByScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDPlusFromSetScoreAndClaculateByScore59() {
		this.score = 59;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDFromSetScoreAndClaculateByScore52() {
		this.score = 52;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeFFromSetScoreAndClaculateByScore49() {
		this.score = 49;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
}
