package com.ControlStatements;

public class Break {
	public static void main(String args[])
	{
		boolean t=true;
		
		first:{
			second:{
				third:{
					System.out.println("not breaked");
					if(t) break second;
					System.out.println("not printed");
		}
		System.out.println("second block");
		}
		System.out.println("third block");
		}
		
	}

}
