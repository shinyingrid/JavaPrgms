package CollectionsPrograms;
import  java.util.*;
public class LinkedListProgram
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		//Insertion
		ll.add(10);
		ll.add(42);
		ll.add(12);
		ll.add(34);
		ll.add(9);
		ll.add(10);
		ll.add(21);
		System.out.println(ll);
		
		//Iteration
		Iterator<Integer> itr = ll.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		
		
		//Removing
		ll.remove(0);
		ll.remove(4);
		System.out.println(ll);
		
		//Accessing
		System.out.println("Element present at the index 1 is:" +ll.get(1));
		
		//Clear function for removing all the linked elements
		ll.clear();
		System.out.println(ll);
	}
}
