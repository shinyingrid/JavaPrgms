package CollectionsPrograms;
import java.util.HashMap;
public class HashMapProgram 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//Adding
		hm.put(3, "Flower");
		hm.put(null, null); //both key and value can be null
		hm.put(2, "Fruit");
		hm.put(2, "Veggies");
		hm.put(1, "Flower");
		System.out.println(hm);
		
		//Searching
		System.out.println(hm.get(1));
		
		//To check whether the key is present
		//returns true if key is present, else false
		System.out.println(hm.containsKey(2));
		
		
		//To check whether the value is present
		//returns true if value is present, else false
		System.out.println(hm.containsValue("Flower")); //true
		
		System.out.println(hm.containsValue("Fruit"));
		//o/p should be true but here it is false,coz fruit got reinitialized with flower
		
		//To get set of keys
		System.out.println(hm.keySet());
		
		//To get list of values
		System.out.println(hm.values());
		
		//To get set of key value pairs
		System.out.println(hm.entrySet());
		
		//To find the number of entries
		System.out.println(hm.size());//4 coz only 4 are there as per the previous o/p
		
		//To clear
		hm.clear();
		System.out.println(hm);
	}

}
