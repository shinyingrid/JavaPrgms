package CollectionsPrograms;
import java.util.*;
public class PriorityQueueProgram 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//Inserting
		pq.add(4);
		pq.add(2);
		pq.add(1);
		pq.add(3);
		System.out.println(pq);
		
		//To access the element in the front node
		System.out.println("Element present in the front end is: "+pq.peek());
		
		//Iteration
		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//To remove the elements
		pq.poll();
		pq.remove();
		pq.poll();
		System.out.println(pq);
		
		//To clear
		pq.clear();
		System.out.println(pq);
		
	}
}
