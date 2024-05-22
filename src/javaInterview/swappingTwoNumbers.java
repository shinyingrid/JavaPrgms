package javaInterview;

import java.lang.reflect.Method;

public class swappingTwoNumbers {

	public static void main(String[] args) 
	{
		//Method 1
		int a =10;
		int b = 20;
		System.out.println("Values before swapping:  a="+a+" and b="+b+"");
		
		 int t = a; // t=10
		 a = b;   //a=20
		 b = t;   // b=10
		 System.out.println("Values after swapping:  a="+a+"   b="+b+" ");

		 
		 //Method 2   only when i and j are non zeros
		 int i= 10;
		 int j=20;
		 System.out.println("Values before swapping:  a="+i+" and b="+j+"");
		
		 i=i+j; // i=10+20; i=30
		 j=i-j; // j =30-20 ;j=10
		 i=i-j; // i=30-10; i=20
		 System.out.println("Values after swapping:  a="+i+"   b="+j+" ");

		 
		 //Method 2   only when i and j are non zeros
		 int c= 10;
		 int d=20;
		 System.out.println("Values before swapping:  a="+c+"   b="+d+" ");
		 
		 c=c*d;  //c=10*20 ; 200
		 d=c/d;  //d=200/20; 10
		 c=c/d;  //c=200/10 ; 20
			 
		 System.out.println("Values after swapping:  a="+c+"   b="+d+" ");

		 
	}

}
