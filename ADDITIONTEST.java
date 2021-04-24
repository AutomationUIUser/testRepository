package DemoProject.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DemoProject.utils.ADDITION;

class ADDITIONTEST {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		int a = 12;
	    int b = 13;
	    int actual = ADDITION.add(a, b);
	 
	    int expected = 25;
	    assertEquals(expected, actual);
	 
	}
	@Test
	void testAdd1() {
		int a = 122;
	    int b = 13;
	    int actual = ADDITION.add(a, b);
	 
	    int expected = 135;
	    assertEquals(expected, actual);
	 
	}
}
