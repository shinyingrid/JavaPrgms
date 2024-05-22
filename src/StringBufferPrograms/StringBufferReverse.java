package StringBufferPrograms;

public class StringBufferReverse
{
	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer("Shiny");
		StringBuffer reverse=new StringBuffer();
		for(int i=sb1.length()-1;i>=0;i--)
		{
			reverse.append(sb1.charAt(i));

		}
		System.out.println(reverse);
	}
}
