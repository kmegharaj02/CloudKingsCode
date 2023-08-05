package com.ControlStatements;

public class ForeachNochange {
	public static void main(String args[])
	{
		int n[]= {1,2,3,4,5,6,7,8,9};
		for(int x:n)
		{System.out.print(x+" ");
		x+=10;

	}
		System.out.println();
		for(int x:n) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
