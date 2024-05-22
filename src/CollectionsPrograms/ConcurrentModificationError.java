package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//ConcurrentModificationError
public class ConcurrentModificationError 
{
	public static void main(String[] args) {
		
	
	List li=new ArrayList();
	li.add("Hello");
	li.add("Madam");
	ListIterator i= li.listIterator();
	while(i.hasNext())
	{
		i.add("Hi");
		i.next();
		li.add("HLL");	
	}
	System.out.println(li);
	}
}
