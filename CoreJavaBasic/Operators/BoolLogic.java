package com.Operators;

public class BoolLogic {
	public static void main(String args[])
	{
		boolean a=true;
		boolean b=false;
		boolean c=a&b;
		boolean d=a|b;
		boolean e=a^b;
		boolean f=!a;
		boolean g=((a&e)&(b^c));
		System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
	}

}
