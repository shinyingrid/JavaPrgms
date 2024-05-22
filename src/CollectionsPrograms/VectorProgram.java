package CollectionsPrograms;
import java.util.*;
public class VectorProgram 
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		
		//Adding
		v.add("I");
		v.add("am");
		v.add("a");
		v.add("nice");
		v.add("person");
		v.addElement("Java");
		v.addElement("Developer");
		System.out.println(v);
		
		//Accessing
		System.out.println("Element present at location 3 is: "+v.get(3));
		
		//Removing
		v.remove(5);
		v.remove(5);
		System.out.println(v);
		
		//Iteration or Transverse
		Iterator<String> itr=v.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
