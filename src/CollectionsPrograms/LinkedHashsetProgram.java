package CollectionsPrograms;
import java.util.*;
public class LinkedHashsetProgram
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		//Adding
		lhs.add("Qspiders");
		lhs.add("Qspiders");
		lhs.add("Java");
		lhs.add("Collection");
		lhs.add("Training");
		lhs.add("A");
		lhs.add("Y");
		lhs.add("y");
		System.out.println(lhs);
		
		//Iteration
		Iterator<String> itr= lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//To check if the "y" is a part of Linked Hashset
		if (lhs.contains("y"))
		{
			System.out.println("y"+"is present in the Linked hashset");
		}
		else 
		{
			System.out.println("y"+"is not present in the Linked hashset");
		}
		
		//To remove elements
		lhs.remove("Y");
		lhs.remove("A");
		lhs.remove("y");
		System.out.println(lhs);
	}
}
