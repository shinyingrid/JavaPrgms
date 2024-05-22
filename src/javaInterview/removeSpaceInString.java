package javaInterview;

public class removeSpaceInString {

	public static void main(String[] args) 
	{
		String str = "Life    is beautiful";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		String str1 = str.replace("L", "S");
		System.out.println(str1);
		
	}

}
