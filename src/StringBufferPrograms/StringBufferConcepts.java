package StringBufferPrograms;

public class StringBufferConcepts 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("ILoveMyKids");
		System.out.println(sb.reverse());
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(0, 5));
		System.out.println(sb.replace(1,5,"like"));
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.deleteCharAt(4));
		
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		sb.setCharAt(0, 'H');
		System.out.println(sb);
		
		sb.ensureCapacity(2);
		System.out.println(sb.capacity());
		
		sb.setLength(2);
		System.out.println(sb);
		
	}
}
