package ComparatorInterface;
import java.util.Arrays;
import java.util.Comparator;
public class EmployeeDriver 
{
	public static void main(String[] args)
	{
		Employee e[]=new Employee[5];
		e[0]=new Employee("Shiny",20,50000);
		e[1]=new Employee("Geetha",13,25000);
		e[2]=new Employee("Dhruv",34,60000);
		e[3]=new Employee("Sash",12,40000);
		e[4]=new Employee("Yatra",37,20000);
		
		Arrays.sort(e,new SortByEname());
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].ename);
		}
		
		Arrays.sort(e,new SortBySalary());
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].salary);
		}
		
		Arrays.sort(e,new SortByEid());
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].eid);
		}
		
		Arrays.sort(e,new DescendingSortBySalary());
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].salary);
		}
	}
}
