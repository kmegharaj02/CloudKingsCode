package com.ControlStatements;

public class BreakError {
			public static void main(String args[])
			{int i=0;
				one:for(i=0;i<5;i++)
				{
					System.out.println(i+" ");
				}
			  two:for(int j=0;j<5;j++)
			  {

				  System.out.print(j+" ");
				  if(j==3) break two;

			  }
			}
}
