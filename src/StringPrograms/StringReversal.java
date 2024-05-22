package StringPrograms;

public class StringReversal
{
	public static void main(String[] args) 
	{
	String s="";
	String a="Bat";
	for(int i=a.length()-1;i>=0;i--)
	{
		s=s+a.charAt(i);
	}
	System.out.println(s);
  }
}
	
