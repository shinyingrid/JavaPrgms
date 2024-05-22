package StringPrograms;

public class LiteralAndObjectComparison
{
	public static void main(String[] args)
	{
		String s1="Hi Manu";
		String s2="Hi Manu";
		String s3=new String("Hi Manu");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false coz s1 is a literal and s3 is an object
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true (not overridden, so only the states are compared
		System.out.println(s1.hashCode()==s2.hashCode());//true -comparing the states
		System.out.println(s1.hashCode()==s3.hashCode());//true
	}
	
}
