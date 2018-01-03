package se_105598067hw4.ut;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import se_105598067hw4.LetterGrade;

public class testEquivalenceLetterGrade {

	@Before
	public void setup() {
		LetterGrade lg = new  LetterGrade();		
	}
	
	@Test
	public void testCase01() {
		char expectedGrade = 'A';
		assertEquals(expectedGrade, LetterGrade.letterGrade(95));
	}
	
	@Test
	public void testCase02() {
		char expectedGrade = 'B';
		assertEquals(expectedGrade, LetterGrade.letterGrade(85));
	}
	
	@Test
	public void testCase03() {
		char expectedGrade = 'C';
		assertEquals(expectedGrade, LetterGrade.letterGrade(75));
	}
	
	@Test
	public void testCase04() {
		char expectedGrade = 'D';
		assertEquals(expectedGrade, LetterGrade.letterGrade(65));
	}
	
	@Test
	public void testCase05() {
		char expectedGrade = 'F';
		assertEquals(expectedGrade, LetterGrade.letterGrade(55));
	}
	
	@Test
	public void testCase06() {
		char expectedGrade = 'X';
		assertEquals(expectedGrade, LetterGrade.letterGrade(-3));
	}

}
