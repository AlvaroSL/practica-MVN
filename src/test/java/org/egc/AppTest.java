package org.egc;

import org.jgrapht.graph.ListenableDirectedGraph;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    
    //Incluyo este test
    public void testAppMethod1(){
    	assertTrue(App.getOne()==1);
    }
    
    public void testAppMethod2(){
    	ListenableDirectedGraph g;
    	
    	g = App.createLDG();
    	
    	assertTrue(g == null);
    }
    
    public void testAppMethod3(){
    	App.getLog();
    }
}
