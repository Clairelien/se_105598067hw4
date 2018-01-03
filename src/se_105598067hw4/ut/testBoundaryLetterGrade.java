package se_105598067hw4.ut;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import se_105598067hw4.LetterGrade;

public class testBoundaryLetterGrade {
	@Before
	public void setup() {
		LetterGrade lg = new  LetterGrade();		
	}

	@Test
	public void testCase07() {
		char expectedGrade = 'X';
		assertEquals(expectedGrade, LetterGrade.letterGrade(101));
	}
	
	@Test
	public void testCase08() {
		char expectedGrade = 'A';
		assertEquals(expectedGrade, LetterGrade.letterGrade(100));
	}
	
	@Test
	public void testCase09() {
		char expectedGrade = 'A';
		assertEquals(expectedGrade, LetterGrade.letterGrade(90));
	}
	
	@Test
	public void testCase10() {
		char expectedGrade = 'B';
		assertEquals(expectedGrade, LetterGrade.letterGrade(89));
	}
	
	@Test
	public void testCase11() {
		char expectedGrade = 'B';
		assertEquals(expectedGrade, LetterGrade.letterGrade(80));
	}
	
	@Test
	public void testCase12() {
		char expectedGrade = 'C';
		assertEquals(expectedGrade, LetterGrade.letterGrade(79));
	}
	
	@Test
	public void testCase13() {
		char expectedGrade = 'C';
		assertEquals(expectedGrade, LetterGrade.letterGrade(70));
	}
	
	@Test
	public void testCase14() {
		char expectedGrade = 'D';
		assertEquals(expectedGrade, LetterGrade.letterGrade(69));
	}
	
	@Test
	public void testCase15() {
		char expectedGrade = 'D';
		assertEquals(expectedGrade, LetterGrade.letterGrade(60));
	}
	
	@Test
	public void testCase16() {
		char expectedGrade = 'F';
		assertEquals(expectedGrade, LetterGrade.letterGrade(59));
	}
	
	@Test
	public void testCase17() {
		char expectedGrade = 'F';
		assertEquals(expectedGrade, LetterGrade.letterGrade(0));
	}
	
	@Test
	public void testCase18() {
		char expectedGrade = 'X';
		assertEquals(expectedGrade, LetterGrade.letterGrade(-1));
	}
}
