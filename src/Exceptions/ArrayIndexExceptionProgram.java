package Exceptions;

public class ArrayIndexExceptionProgram
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		try
		{
			System.out.println(a[5]); //ArrayIndexExceptionProgram
		}
		catch (IndexOutOfBoundsException e)
		{
		System.out.println("Access the elements within the array");
		}
			
	}
}
