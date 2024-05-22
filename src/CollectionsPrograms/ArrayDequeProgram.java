package CollectionsPrograms;
import java.util.*;
public class ArrayDequeProgram 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		
		//Inserting
		dq.add(100);
		dq.add(10);
		dq.add(1);
		dq.add(55);
		dq.addFirst(60);
		dq.addLast(80);
		System.out.println(dq);
		
		//Iteration
		Iterator<Integer> itr = dq.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//To find peek element
		System.out.println("Peak element is: "+dq.peek());
		
		//Remove
		dq.removeFirst();
		dq.removeLast();
		dq.poll();
		System.out.println(dq);
		
		//To clear
		dq.clear();
		System.out.println(dq);
	}
}
