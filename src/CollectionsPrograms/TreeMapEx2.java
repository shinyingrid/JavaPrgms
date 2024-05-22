package CollectionsPrograms;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2
{
	public static void main(String[] args)
	{
		Map<Integer, TreeMapEx1> courses = new TreeMap<Integer,TreeMapEx1>();
		courses.put(1, new TreeMapEx1("Java Courses", 3));
		courses.put(2, new TreeMapEx1("AWS Courses", 7));
		courses.put(3, new TreeMapEx1("Programming Courses", 8));
		courses.put(4, new TreeMapEx1("Data Science Courses", 2));
		
		System.out.println("Total Courses" + courses.size());
		
		Collection<TreeMapEx1> st=courses.values();
		for(TreeMapEx1 me:st)
		{
			if(me.count==8)
			{
				System.out.println(me.course);
			}
		}
	}
}
