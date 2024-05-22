package StringPrograms;

public class IgnoreChar 
{
	public static void main(String[] args)
	{
		String str="Umbrella";
		String s="";//creating a container
		for(int i=0;i<str.length();i++)//i=0;i<8;i++
		{
			if(str.charAt(i)!='l')//'U'!='l'
			{
				s= s + str.charAt(i);//s="U" /s="U"+"m"="Um" ... goes on by concatenation
			} //on checking when l!=l, the condition becomes false, so the process doesnt enter the block.. so l doesnt get printed
		}
		System.out.println(s);
	}
}
