package Exceptions;

public class StringIndexSubStringProgram 
{
	public static void main(String[] args)
	{
	String s="Narayan";
	String str;
	try
	{
		str = s.substring(2,8);  //index 2 to index 8
		System.out.println(str);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("Access the elements within the String");
	}
}
}
