package com.opshub.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* adddddd
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

	public static int EXPECTED_RESULT = 5;
	/**
     * Create the test case for demo
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
	system.out.println("Hi");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Calculator c = new Calculator();
    	int result = c.add(2, 3);
		assertEquals(EXPECTED_RESULT, result);
	// adding comment
    		
    }
}
