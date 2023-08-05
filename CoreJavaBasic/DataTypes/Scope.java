package com.DataTypes;

public class Scope {
	public static void main(String args[])
	{
		int x=10;
		if(x==10)
		{
			int y=20;
			System.out.println(x);
			System.out.println(y);
		}
		//y++;//here y's scope ends in previous block
		System.out.print(x);
	}

}
