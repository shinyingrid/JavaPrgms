package Exceptions;
import java.util.Scanner;
public class MultipleException 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number");
		int a =sc.nextInt();
		System.out.println("Enter another number");
		int b=sc.nextInt();
		int res;
		System.out.println("Enter your first name");
		String str=sc.next();
		String s=null;
		int arr[]= {4,2,5,6,7};
		try
		{
			res = a/b;
			System.out.println(str.charAt(2));
			System.out.println(s.toUpperCase());
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero should not be used");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Access the String characters within the limits");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null can't be used for any string operations");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Access the array elements within the limits");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!");
		}
		catch(Throwable e)
		{
			System.out.println("Oops!...Something went wrong");
		}
		
	}
}
