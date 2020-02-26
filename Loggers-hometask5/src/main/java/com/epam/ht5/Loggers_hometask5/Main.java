package com.epam.ht5.Loggers_hometask5;

import org.apache.log4j.Logger;

public class Main 

{
	static Logger log = Logger.getLogger(Main.class.getName());
    public static void main( String[] args )
    {
    	Interest.calculateInterest();
        Construction.costEvaluator();
    }
}
