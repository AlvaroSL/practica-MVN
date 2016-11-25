package org.egc;

import org.jgrapht.graph.ListenableDirectedGraph;
import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
	static Logger log = Logger.getLogger(App.class);


	public static int getOne() {
		return 1;
	}
	
	public static ListenableDirectedGraph createLDG(){
		ListenableDirectedGraph g;
		
		g = null;
		
		return g;
	}
	
	public static void getLog(){
		log.info("Returning 1");
	}
    
}
