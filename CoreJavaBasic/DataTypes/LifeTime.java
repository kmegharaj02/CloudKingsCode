package com.DataTypes;

public class LifeTime {
	public static void main(String args[])
	{
		int x,y=1;
		for (x=0;x<5;x++)
		{
			//int y=1;
			System.out.println(y);
			y++;
			System.out.println(y);
		}
	}

}
