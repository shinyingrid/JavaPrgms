package CollectionsPrograms;
import java.util.*;
public class HashSetProgram 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(12);
		al1.add(2);
		al1.add(87);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(12);
		al2.add(2);
		al2.add(87);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.addAll(al1);
		hs1.addAll(al2);
		hs1.add(5);
		hs1.add(22);
		hs1.add(32);
		hs1.add(5);
		hs1.add(32);
		hs1.add(11);
		hs1.add(21);
		System.out.println(hs1);
		//Duplicates are removed
		
		//Iterating
		Iterator<Integer> itr = hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Remove
		hs1.remove(32);
		hs1.remove(11);
		hs1.remove(al1);
		System.out.println(hs1);
		
		//To clear
		hs1.clear();
		System.out.println(hs1);
		
	}
} 
