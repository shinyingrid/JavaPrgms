package Exceptions;

import java.io.FileInputStream;
import java.io.IOException;


public class ChEx_throws {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C://abc.txt");
		fis.available();

	}
	
	//Error is expected in the output
	

}
