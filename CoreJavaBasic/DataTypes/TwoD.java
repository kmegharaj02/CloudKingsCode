package com.DataTypes;

public class TwoD {
	public static void main(String args[])
	{int two[][]=new int[3][];
	two[0]=new int[1];
	two[1]=new int[2];
	two[2]=new int[3];
	
	int i,j,k=0;
	
	for(i=0;i<3;i++)
		for(j=0;j<i+1;j++)
		{
			two[i][j]=k;
					k++;
		}
	
	for(i=0;i<3;i++) {
		for(j=0;j<i+1;j++)
			System.out.print(two[i][j]+" ");
			System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	}

}
