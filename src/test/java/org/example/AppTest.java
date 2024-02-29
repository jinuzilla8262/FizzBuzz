package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.fizzBuzz;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    /**
     * Create the test case
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
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFizzBuzz() {
        assertEquals("1", fizzBuzz(1));
        assertEquals("2", fizzBuzz(2));
        //Test Cases for Fizz as expected output
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz(6));
        assertEquals("Fizz", fizzBuzz(9));
        //Test Cases for Bizz as expected output
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
        //Test Cases for FizzBuzz as expected output
        assertEquals("FizzBuzz", fizzBuzz(15));
    }
}
