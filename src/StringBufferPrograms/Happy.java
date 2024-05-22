package StringBufferPrograms;

public class Happy extends Thread
{
	final StringBuffer sb1=new StringBuffer();
	final StringBuffer sb2=new StringBuffer();
	
	public static void main(String[] args) {
		
		final Happy h=new Happy();
		
		Thread t=new Thread(()->{
		{
			h.sb1.append("A");
			h.sb2.append("A");
			System.out.println(h.sb1);
			System.out.println(h.sb2);
		}
		
		});
		t.start();
	}
}
