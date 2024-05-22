package Exceptions;
import java.util.Scanner;
public class ArithmeticException1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a/b;
		System.out.println("The division of"+a+"and"+b+"="+c);
				
	}
}

/*case 1: a=5, b=10  Normal situation - no error
 * case 2: a=5, b=0  Abnormal situation - Exception occurs*/
 