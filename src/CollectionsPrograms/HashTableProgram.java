package CollectionsPrograms;
import java.util.Hashtable;
public class HashTableProgram
{ //both key and value cannot be null, if so we will get a null pointer exception
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		//Adding
		ht.put(4, "Shiny");
		ht.put(1, "Harry");
		ht.put(5, "Gautham");
		ht.put(2, "Sheela");
		ht.put(3, "Hello");
		System.out.println(ht);
		//o/p - {5=Gautham, 4=Shiny, 3=Hello, 2=Sheela, 1=Harry} not organized, so it is a reversible manner
		
		//To get set of keys
				System.out.println(ht.keySet());
				//set of keys in the descending order
				
				//To get list of values
				System.out.println(ht.values());
				
				//To get the set of key value pairs
				System.out.println(ht.entrySet());
				
				//To find the number of entries
				System.out.println(ht.size());
				
				//To clear
				ht.clear();
				System.out.println(ht);
	}
}
