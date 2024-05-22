package StringPrograms;

public class StringMethod 
{
	public static void main(String [] args)
	{	
		//toUpperCase() is used for converting lower case to upper case
		String lname="shiny";
		String uname=lname.toUpperCase();
		System.out.println(uname);
		
		//toLowerCase() is used for converting upper case to lower case
		String lname1=uname.toLowerCase();
		System.out.println(lname1);
		
		//concat() is used for clubbing two strings together
		String s1="Apple";
		String s2=s1.concat("Mango");
		System.out.println(s2);
		//String s2="Mango";  String s3=s1.concat(s2); s.o.pln(s3);
		
		
		//trim() is used to trim or remove the space before and after the string mentioned within double quotes
		String s3=" Cakes & Bakes . ";
		String s4=s3.trim();
		System.out.println(s4);		
		
		//substring() is used to extract a part of the String as per requirement
		String s5="Chocolates";
		String s6=s5.substring(0, 5);//end index 5 means it will take up to 4th index
		System.out.println(s6);
		String s7=s5.substring(5);//
		System.out.println(s7);
		
		//CharAt() is used to print the char in the specified index
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.charAt(10));
		
		//indexOf() is used to find the index of a char
		int index=alphabet.indexOf("W");
		int index1=alphabet.indexOf("a");//o/p will be -1 if a char is not in the given string
		System.out.println(index);
		System.out.println(index1);
		
		
	}

}
