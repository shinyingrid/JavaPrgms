package CollectionsPrograms;
import java.util.*;
public class TreeSetProgram 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(10);
        al.add(20);
        al.add(21);
        al.add(5);
        al.add(10);
        al.add(32);
        al.add(40);
        System.out.println(al);

        TreeSet<Integer> ts = new TreeSet<Integer>();

        //Inserting
        ts.addAll(al);
        ts.add(22);
        ts.add(11);
        ts.add(1);
        System.out.println(ts);

        //To check 1st & last element
        System.out.println("1st element is : "+ts.first());
        System.out.println("Last element is : "+ts.last());

        //To remove 1st & last element
        ts.pollFirst();
        ts.pollLast();
        System.out.println(ts);

        //To remove a specific object
        ts.remove(4);
        ts.remove(32);
        System.out.println(ts);

        //To remove all the elements
        ts.clear();
        System.out.println(ts);
	}
}
