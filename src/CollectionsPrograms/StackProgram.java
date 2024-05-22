package CollectionsPrograms;
import java.util.*;
public class StackProgram
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack<Integer>();
		
		
		//Adding
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println(stk);
		
		//Removing
		stk.pop();
		stk.pop();
		System.out.println(stk);
		
		//Searching
		System.out.println("Element with value 30 inside the stack is in index: "+stk.search(10));
		
		//Finding the top most element
		System.out.println("Top most element in the stack is: "+ stk.peek());
		
		//Iteration
		Iterator<Integer> itr = stk.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Clear
		stk.clear();
		System.out.println(stk);
		
	}

}
