package ComparatorInterface;
import java.util.Comparator;
public class SortByEid implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.eid==e2.eid)
		{
		return 0;
		}
		else if(e1.eid>e2.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
