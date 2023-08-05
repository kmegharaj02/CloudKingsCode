package com.DataTypes;

class Conversion {
	public static void main(String args[])
	{
		int a=10,i=257;
		byte b=20,d;
		short s=30;
		long l=40;
		char c='Z';
		System.out.println("before type conversion");
		System.out.println(a+" "+ b+" "+ s+" "+ l+" "+ c);
		
		b=(byte) l;
		s=(short) a;
		a=(int) c;
		System.out.println(b+" "+s+" "+a);
		
		d=(byte) i;
		System.out.println(d);//byte's range is 256 so it divides 257 and gives remainder as result
		
		
	}

}
