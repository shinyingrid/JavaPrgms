package CollectionsPrograms;
import java.util.HashSet;
public class HashRetain 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("E");
		subSet.add("B");
		subSet.add("A");
		subSet.add("F");
		hs.retainAll(subSet);
		
		System.out.println(hs);
	}
}
