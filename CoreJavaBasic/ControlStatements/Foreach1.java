package com.ControlStatements;

public class Foreach1 {
	public static void main(String args[])
	{
		int n[][]=new int[3][4];
		int sum=0;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				n[i][j]=i+j;
		
		for(int x[]:n) {
			for(int y:x) {
				System.out.print(y);
				//int sum=0;
				sum=sum+y;
				//System.out.println(sum);

			}
		System.out.println();
		//System.out.println(sum);

		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
