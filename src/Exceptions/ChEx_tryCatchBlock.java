package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChEx_tryCatchBlock
{
	//Declaring a single exception
	public static void main(String[] args)    // use throws FileNotFoundException if the commented method is used
	{
		System.out.println("Hi");
		m1();
		System.out.println("Bye");
		
	}
	
//	public static void m1() throws FileNotFoundException
//	{
//		FileInputStream fin = new FileInputStream("C://abc.txt");
//	}
	
	
	public static void m1()
	{
		try
		{
			FileInputStream fin = new FileInputStream("C://abc.txt");
		} 
		
		catch (FileNotFoundException e)
		{
			System.out.println("No such file is found");
		}
	}
	
}
