package Exceptions;


import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) 
	{
		int a[] = new int[5]; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position in the array");
		int position = sc.nextInt();

		System.out.println("Enter the value to be inserted");
		int value = sc.nextInt();
		
		a[position]=value;
		System.out.println("Integer "+value+" is inserted in position "+position);
		
		// ArrayIndexOutOfBoundsException - cannot be handled because it happens during run time
		// and it is an unchecked exception
		
		

	}

}
