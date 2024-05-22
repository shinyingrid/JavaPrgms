package StringPrograms;

public class PalindromeInAString
{
	public static void main(String[] args)
	{
		String s1="madam";
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=i+2;j<=s1.length();j++)
			{
				String s2=s1.substring(i, j);
				if(isPalindrome(s2))
				{
					System.out.println(s2);
				}
			}
		}
	}

	private static boolean isPalindrome(String s2) {
		// TODO Auto-generated method stub
		return true;
	}
}
