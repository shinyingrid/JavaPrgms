package javaInterview;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) 
	{
		// when a number is divisible by 1 or itself. Number should be greater than 1
		//Ex: 2,3,5,7,11,13,17....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
			
		int num =sc.nextInt();
		System.out.println("Entered number is "+num);
		
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
						
			}
			if(count==2)
				System.out.println(num+" is a Prime number");
			else
			{
				System.out.println(num+" is not a Prime number");
			}
		}
		
		
	}		
}
