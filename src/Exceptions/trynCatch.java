package Exceptions;
import java.util.Scanner;
public class trynCatch
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
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
			System.out.println(res);
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
			System.out.println("Check within the string limit");
		}
		catch (NullPointerException e) 
		{
			System.out.println("Null should not be used");
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println("Check within array index");
		}
	}
}
