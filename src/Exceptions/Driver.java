package Exceptions;

public class Driver 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new NotValidException();
		}
		catch (NotValidException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class NotValidException extends Exception
{
	@Override
	public String getMessage()
	{
		return "Custom exception is handled";
	}
}