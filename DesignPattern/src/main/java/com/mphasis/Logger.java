package com.mphasis;

public class Logger {
	
	private static Logger instance;
	
	private Logger() {
	}
		
		public static Logger getInstance() {
			if(instance!=null)
				return instance;
			else
				return instance= new Logger();
		
	}
		public void log(String msg) {
	        System.out.println("LOG: " + msg);
	    }

}
