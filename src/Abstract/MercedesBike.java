package Abstract;

public class MercedesBike extends Bike
{
	@Override
	public int getNoOfWheels()
	{
		return 4;
	}
	
	public static void main(String[] args)
	{
		Bike b=new MercedesBike();
		System.out.println(b.getNoOfWheels());//4
		Vehicle v=new MercedesBike();
		System.out.println(v.getNoOfWheels());//4
	}
}
