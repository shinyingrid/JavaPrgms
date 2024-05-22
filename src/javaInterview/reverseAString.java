package javaInterview;
import java.util.Scanner;

public class reverseAString {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character");
		
		String str = scanner.next();
		String revString = "";
		
		int length = str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			revString=revString+str.charAt(i);
		}
		System.out.println(revString);

	}

}
