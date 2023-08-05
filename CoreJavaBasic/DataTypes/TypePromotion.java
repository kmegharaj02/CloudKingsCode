package com.DataTypes;

public class TypePromotion {
	public static void main(String args[])
	{
		byte a=40;
		byte b=50;
		byte c=100;
		int d=a*b/c;
		
		System.out.println(d);
		//b=b*2;//here b has been promoted to int in previous expression so now we have to do type casting again to the byte
		b=(byte) (b*2);
		System.out.println(b);
	}

}
