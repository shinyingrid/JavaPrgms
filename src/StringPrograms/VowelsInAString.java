package StringPrograms;

public class VowelsInAString 
{
	public static void main(String[] args)
	{
	String s="JAVaDeveloper";
	String s1=s.toLowerCase();
	int count =0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c=s1.charAt(i);
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
		}
	}
	System.out.println(count);
  }
}
