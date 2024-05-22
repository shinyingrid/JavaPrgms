package CompareTo;
import java.util.Arrays;

//Comparable interface has CompareTo method
public class Book implements Comparable
{//add unimplemented method while getting error in Book
	
	int bid;
	String title;
	double price;
	
	public Book(int bid,String title,double price)
	{
		this.bid=bid;
		this.title=title;
		this.price=price;
	}
	
	@Override
	public int compareTo(Object o)
	{
		//downcast object to Book (like equals to method).Here if current object (using this keyword) is compared to passed object, we will be returning 0
		Book b=(Book)o;
		if(this.price==b.price)
		{	
		return 0;
		}
		else if(this.price>b.price) //string cannot be compared
		{
			return 1;
		}
		else
		{
			return -1;
		}  /* Here we are getting in ascending order.This is called Natural sorting. If we need descending order
		  then 
		  else if(......)
		  {
		  return -1;
		  }
		  else
		  {
		  return 1;
		  }
		  By interchanging the -1 and +1 we can change the order*/
	}
	
	public static void main(String[] args)
	{
		Book b[]=new Book[5];
		b[0]=new Book (4,"Java",500);
		b[1]=new Book(3,"SQL",400);
		b[2]=new Book(5,"Harry Potter",600);
		b[3]=new Book(2,"Testing",300);
		b[4]=new Book(1,"WebTech",200);
		
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].price);
		} //here we can compare only one element at a time. so for string we create a separate loop
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i].title);
		}
	}

}
