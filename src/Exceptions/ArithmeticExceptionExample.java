package Exceptions;
import java.util.Scanner;
public class ArithmeticExceptionExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b=sc.nextInt();
		int res;
		try 
		{
			res=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Zero can't be used");
		}
	}
}
