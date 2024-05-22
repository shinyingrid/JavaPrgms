package Exceptions;

public class FinallyProgram 
{
	public static void main(String[] args)
	{
		//when there is no exception
		try
		{
			int a =10/5;
			System.out.println(a);//2
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero should not be used");
		}
		finally
		{
			System.out.println("Finally executes 1st time");//Finally executes first time
		}
		//when there is an exception
		try
		{
			int a =10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero should not be used");//Zero should not be used
		}
		finally
		{
			System.out.println("Finally executes 2nd time");//Finally executes 2nd time
		}
	}
}
