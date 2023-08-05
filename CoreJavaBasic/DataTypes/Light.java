package com.DataTypes;

public class Light {
	public static void main(String args[])
	{
	int days=1000;
	int lightspeed=186000;
	long seconds;
	seconds=days*24*60*60;
	long distance=lightspeed*seconds;
	
	System.out.print("in "+ days +" days light will tavel about "+ distance +" miles");
	//in 10 days light will travel about ...... mies
	}
}
