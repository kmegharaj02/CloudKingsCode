package com.DataTypes;

public class Matrix {
	public static void main(String args[])
	{
		double m[][]= {{0*0,0*1,0*2,0*3,0*4},
					 {1*0,1*1,1*2,1*3,1*4},
					 {2*0,2*1,2*2,2*3,2*4},
					 {3*0,3*1,3*2,3*3,3*4},
					};
		int i,j;
		
		for (i=0;i<4;i++) {
			for(j=0;j<5;j++)
			
				System.out.print(m[i][j]+"  ");
				System.out.println();
		}
	}
}
			
		
