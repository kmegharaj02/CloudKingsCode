package com.ControlStatements;

public class Continue {
	public static void main(String args[])
	{int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
			if(i%2==0) continue;
			i++;
		
			System.out.println();
			
		}
	}

}
