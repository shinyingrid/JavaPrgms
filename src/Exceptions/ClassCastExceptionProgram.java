package Exceptions;

public class ClassCastExceptionProgram extends ArithmeticExceptionExample
{
	public static void main(String[] args) 
	{
		ArithmeticExceptionExample ae = new ArithmeticExceptionExample();
		ClassCastExceptionProgram ce;
		try
		{
			ce=(ClassCastExceptionProgram)ae;
		} 
		catch (Exception e)
		{
			System.out.println("Without upcasting you cannot downcast");
		}
	}
}
