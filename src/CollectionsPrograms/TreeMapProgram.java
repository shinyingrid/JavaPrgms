package CollectionsPrograms;
import java.util.TreeMap;
public class TreeMapProgram
{
	public static void main(String[] args)
	{ //insertion order is not maintained but key should be of comparable type
		//everything should be sorted
		//else we get classcast exception
		//values can be null and keys can be null
		TreeMap<Double, String> tm= new TreeMap<>();
		
		//Adding
		tm.put(1.0, null);
		tm.put(5.0, "Boolean");
		tm.put(7.0, "Double");
		tm.put(3.0, "Character");
		System.out.println(tm);
		
		//Searching
		System.out.println(tm.get(1.0)); //CCE when given 1 - elements should be of comparable type 1.0 and not 1
		System.out.println(tm.containsKey(2.0));//false - since 2.0 is not present
		System.out.println(tm.containsValue("Character"));//true
		
		//To get set of keys
		System.out.println(tm.keySet());
		//set of keys in the descending order
		
		//To get list of values
		System.out.println(tm.values());
		
		//To get the set of key value pairs
		System.out.println(tm.entrySet());
		
		//To find the number of entries
		System.out.println(tm.size());
		
		//To clear
		tm.clear();
		System.out.println(tm);
	}
}
