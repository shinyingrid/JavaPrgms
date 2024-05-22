package Exceptions;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class ChEx_DeclaringMultipleExcep 
{
	//Declaring multiple exceptions
	public static void main(String[] args) throws FileNotFoundException, InterruptedException
	{
		System.out.println("Hi");
		m1();
		System.out.println("Bye");
	}
	
	public static void m1() throws FileNotFoundException, InterruptedException
	{
		Thread.sleep(1000);
		FileInputStream fin = new FileInputStream("C:\\abc.txt");
	}
}
