package com.DataTypes;

public class Promote {
	public static void main(String args[])
	{
	byte b=10;
	short s=20;
	int a=30,z;
	long l=40;
	float f=5.5f;
	double d=100.5;
	
	 d= (b*s)+(a*l)+(f*d);
	 System.out.println(d);
	 
	 z=(int) d;
	System.out.println(z);
	
	}
}
