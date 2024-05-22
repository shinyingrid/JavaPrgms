package javaInterview;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) 
	{
			//palindrome means the reverse is also the same
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num  = sc.nextInt();
		
		int org_num = num;
		
		int rev =0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reversed number is "+rev);
		
		if(org_num==rev)
		{
			System.out.println(org_num+" is a Palindrome number");
		}
		else
		{
			System.out.println(org_num+" is not a Palindrome number");
		}
		
	}
}
