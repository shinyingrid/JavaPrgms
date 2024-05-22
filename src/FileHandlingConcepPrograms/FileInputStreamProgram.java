package FileHandlingConcepPrograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import Exceptions.trynCatch;
public class FileInputStreamProgram 
{
	public static void main(String[] args)
	{
		
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\Shiny Ingrid C\\OneDrive\\Documents\\TestData.xlsx");
			System.out.println(fis.available());
			int r = fis.read();
			System.out.println(r);
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File Not found");
		}
		catch (IOException e)
		{
			System.out.println("Something went wrong");
		}
	}
}
