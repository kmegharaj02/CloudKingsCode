package com.ControlStatements;

public class Break4 {
	public static void main(String args[])
	{
		outer:for(int i=0;i<3;i++)
		{
			System.out.print("pass"+i+" ");
			inner: for(int j=0;j<20;j++)
			{ if(j==15) break outer;
				System.out.print(j+" ");
			}
			System.out.println();

		}
	}

}
