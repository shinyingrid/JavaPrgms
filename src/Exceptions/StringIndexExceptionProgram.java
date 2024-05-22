package Exceptions;

public class StringIndexExceptionProgram 
{
	public static void main(String[] args)
	{
		String s="Kumar";
		System.out.println(s.charAt(0));//K
		System.out.println(s.charAt(1));//u
		System.out.println(s.charAt(2));//m
		System.out.println(s.charAt(3));//a
		System.out.println(s.charAt(4));//r
		System.out.println();
		try
		{
			System.out.println(s.charAt(5));//StringIndexOutOfBoundsException
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("Access the characters of string within the limit");
		}
	}
}
