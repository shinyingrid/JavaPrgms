package Exceptions;

public class NullPointerExample
{
	public static void main(String[] args) {
		
		String s=null;
		String s1;
		try
		{
			s1=s.toLowerCase();
			System.out.println(s1);
		}
		catch (NullPointerException e)
		{
			System.out.println("Null should not be used");
		}
	}
}
