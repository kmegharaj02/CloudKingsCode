package com.ControlStatements;

public class BreakLoop {
	public static void main(String args[])
	{
		for(int i=0;i<20;i++) {
			if(i==10)
				break;
			System.out.println(i);
		}
		System.out.println("loop break");
	}

}
