package com.mphasis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemosFileNotFoundException implements AutoCloseable {

	public static void main(String[] args)  throws FileNotFoundException{
		
		File f=new File("demo.txt");
		useFile(f);
		

	}

	public static void useFile(File f) throws FileNotFoundException{
		if(!f.exists())
		{
			throw new FileNotFoundException();
		}
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("colsed successfully...");
		
	}

}
