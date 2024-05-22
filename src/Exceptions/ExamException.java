package Exceptions;

public class ExamException
{
	public static void main(String[] args)
	{
	  try 
	  {
		String []s=new String[10];
		s=null;
		s[0]="java";
		System.out.println(s[0]);
	} 
	  catch (Exception e) 
	  {
		System.out.println("E");
	}
	
	  /*	catch(NullPointerException n)
	  {
			System.out.println("N");
	  }*/
	  
	}
}
