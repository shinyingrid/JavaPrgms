package CollectionsPrograms;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram 
{
	public static void main(String[] args)
	{
		ArrayList<String>lst=new ArrayList<String>();
		//Inserting
		lst.add("Jspiders");//index 0
		lst.add("Jspiders");//index 1
		lst.add("Java");//index 2
		lst.add("Collections");//index 3
		lst.add("List");//index 4
		lst.add("ArrayList");//index 5
		System.out.println(lst);
		
		//Accessing
		System.out.println("Element at index 2 is:"+lst.get(2));
		
		//Replacing
		lst.set(1, "Qspiders");
		System.out.println(lst);
		
		//Removing
		lst.remove(3);
		lst.remove(4);
		System.out.println(lst);
		
		//Iterating
		Iterator<String>itr =lst.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}


