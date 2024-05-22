package Program1;

public class TypeCasting {
	
	public static void main(String[] args)
	{
		//PRIMITIVE TYPECASTING (WIDENING)
		//BYTE TO ALL DATA TYPES
		byte b = 25;
		short s = b;
		//char c = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		//SHORT TO ALL DATA TYPES
		short s1 = 60;
		//char c1 = s1;
		int i1 = s1;
		long l1 = s1;
		float f1 = s1;
		double d1 = s1;
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
	
		
		//CHAR TO ALL DATA TYPES
		char c2 = 'A';
		int i2 = c2;
		long l2 = c2;
		float f2 = c2;
		double d2 = c2;
		System.out.println(c2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		
		
		//INT TO ALL DATA TYPES
		int i3 = 120;
		long l3 = i3;
		float f3 = i3;
		double d3 = i3;
		System.out.println(i3);
		System.out.println(l3);
		System.out.println(f3);
		System.out.println(d3);
		
		//LONG TO ALL DATA TYPES 
		long l4 = 450;
		float f4 = l4;
		double d4 = l4;
		System.out.println(l4);
		System.out.println(f4);
		System.out.println(d4);
		
		//FLOAT TO DOUBLE 
		float f5 =  750;
		double d5 = f5;
		System.out.println(f5);
		System.out.println(d5);
		
		
		//PRIMITIVE TYPE CASTING (NARROWING)
		
		//DOUBLE TO ALL DATA TYPES
		double dd = 850;
		float ff = (float)dd;
		long ll = (long)dd;
		int ii = (int)dd;
		char cc = (char)dd;
		byte bb = (byte)dd;
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(ll);
		System.out.println(ii);
		System.out.println(cc);
		System.out.println(bb);
		
		//FLOAT TO ALL DATA TYPES
		float ff1 = 740;
		long ll1 = (long)ff1;
		int ii1 = (int)ff1;
		char cc1 = (char)ff1;
		short ss1 = (short)ff1;
		byte bb1 = (byte)ff1;
		System.out.println(ff1);
		System.out.println(ll1);
		System.out.println(ii1);
		System.out.println(cc1);
		System.out.println(ss1);
		System.out.println(bb1);
		
		
		//LONG TO ALL DATA TYPES
		long ll2 = 480;
		int ii2 = (int)ll2;
		char cc2 = (char)ll2;
		short ss2 = (short)ll2;
		byte bb2 = (byte)ll2;
		System.out.println(ll2);
		System.out.println(ii2);
		System.out.println(cc2);
		System.out.println(ss2);
		System.out.println(bb2);
		
		// INT TO ALL DATA TYPES
		int ii3 = 650;
		char cc3 = (char)ii3;
		short ss3 = (short)ii3;
		byte bb3 = (byte)ii3;
		System.out.println(ii3);
		System.out.println(cc3);
		System.out.println(ss3);
		System.out.println(bb3);
		
		// CHAR TO ALL DATA TYPES
		char cc4 = 'a';
		short ss4 = (short)cc4;
		byte bb4 = (byte)cc4;
		System.out.println(cc4);
		System.out.println(ss4);
		System.out.println(bb4);
		
		//SHORT TO BYTE
		short ss5 = 130;
		byte bb5 = (byte)ss5;
		System.out.println(ss5);
		System.out.println(bb5);
		
	}

}
